package typings.googleapis.remotebuildexecutionV1Mod.remotebuildexecutionV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaBuildBazelRemoteExecutionV2ActionResult extends StObject {
  
  /**
    * The details of the execution that originally produced this result.
    */
  var executionMetadata: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ExecutedActionMetadata] = js.undefined
  
  /**
    * The exit code of the command.
    */
  var exitCode: js.UndefOr[Double | Null] = js.undefined
  
  /**
    * The output directories of the action. For each output directory requested in the `output_directories` or `output_paths` field of the Action, if the corresponding directory existed after the action completed, a single entry will be present in the output list, which will contain the digest of a Tree message containing the directory tree, and the path equal exactly to the corresponding Action output_directories member. As an example, suppose the Action had an output directory `a/b/dir` and the execution produced the following contents in `a/b/dir`: a file named `bar` and a directory named `foo` with an executable file named `baz`. Then, output_directory will contain (hashes shortened for readability): ```json // OutputDirectory proto: { path: "a/b/dir" tree_digest: { hash: "4a73bc9d03...", size: 55 \} \} // Tree proto with hash "4a73bc9d03..." and size 55: { root: { files: [ { name: "bar", digest: { hash: "4a73bc9d03...", size: 65534 \} \} ], directories: [ { name: "foo", digest: { hash: "4cf2eda940...", size: 43 \} \} ] \} children : { // (Directory proto with hash "4cf2eda940..." and size 43) files: [ { name: "baz", digest: { hash: "b2c941073e...", size: 1294, \}, is_executable: true \} ] \} \} ``` If an output of the same name as listed in `output_files` of the Command was found in `output_directories`, but was not a directory, the server will return a FAILED_PRECONDITION.
    */
  var outputDirectories: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2OutputDirectory]] = js.undefined
  
  /**
    * The output directories of the action that are symbolic links to other directories. Those may be links to other output directories, or input directories, or even absolute paths outside of the working directory, if the server supports SymlinkAbsolutePathStrategy.ALLOWED. For each output directory requested in the `output_directories` field of the Action, if the directory existed after the action completed, a single entry will be present either in this field, or in the `output_directories` field, if the directory was not a symbolic link. If an output of the same name was found, but was a symbolic link to a file instead of a directory, the server will return a FAILED_PRECONDITION. If the action does not produce the requested output, then that output will be omitted from the list. The server is free to arrange the output list as desired; clients MUST NOT assume that the output list is sorted. DEPRECATED as of v2.1. Servers that wish to be compatible with v2.0 API should still populate this field in addition to `output_symlinks`.
    */
  var outputDirectorySymlinks: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2OutputSymlink]] = js.undefined
  
  /**
    * The output files of the action that are symbolic links to other files. Those may be links to other output files, or input files, or even absolute paths outside of the working directory, if the server supports SymlinkAbsolutePathStrategy.ALLOWED. For each output file requested in the `output_files` or `output_paths` field of the Action, if the corresponding file existed after the action completed, a single entry will be present either in this field, or in the `output_files` field, if the file was not a symbolic link. If an output symbolic link of the same name as listed in `output_files` of the Command was found, but its target type was not a regular file, the server will return a FAILED_PRECONDITION. If the action does not produce the requested output, then that output will be omitted from the list. The server is free to arrange the output list as desired; clients MUST NOT assume that the output list is sorted. DEPRECATED as of v2.1. Servers that wish to be compatible with v2.0 API should still populate this field in addition to `output_symlinks`.
    */
  var outputFileSymlinks: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2OutputSymlink]] = js.undefined
  
  /**
    * The output files of the action. For each output file requested in the `output_files` or `output_paths` field of the Action, if the corresponding file existed after the action completed, a single entry will be present either in this field, or the `output_file_symlinks` field if the file was a symbolic link to another file (`output_symlinks` field after v2.1). If an output listed in `output_files` was found, but was a directory rather than a regular file, the server will return a FAILED_PRECONDITION. If the action does not produce the requested output, then that output will be omitted from the list. The server is free to arrange the output list as desired; clients MUST NOT assume that the output list is sorted.
    */
  var outputFiles: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2OutputFile]] = js.undefined
  
  /**
    * New in v2.1: this field will only be populated if the command `output_paths` field was used, and not the pre v2.1 `output_files` or `output_directories` fields. The output paths of the action that are symbolic links to other paths. Those may be links to other outputs, or inputs, or even absolute paths outside of the working directory, if the server supports SymlinkAbsolutePathStrategy.ALLOWED. A single entry for each output requested in `output_paths` field of the Action, if the corresponding path existed after the action completed and was a symbolic link. If the action does not produce a requested output, then that output will be omitted from the list. The server is free to arrange the output list as desired; clients MUST NOT assume that the output list is sorted.
    */
  var outputSymlinks: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2OutputSymlink]] = js.undefined
  
  /**
    * The digest for a blob containing the standard error of the action, which can be retrieved from the ContentAddressableStorage.
    */
  var stderrDigest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.undefined
  
  /**
    * The standard error buffer of the action. The server SHOULD NOT inline stderr unless requested by the client in the GetActionResultRequest message. The server MAY omit inlining, even if requested, and MUST do so if inlining would cause the response to exceed message size limits.
    */
  var stderrRaw: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The digest for a blob containing the standard output of the action, which can be retrieved from the ContentAddressableStorage.
    */
  var stdoutDigest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.undefined
  
  /**
    * The standard output buffer of the action. The server SHOULD NOT inline stdout unless requested by the client in the GetActionResultRequest message. The server MAY omit inlining, even if requested, and MUST do so if inlining would cause the response to exceed message size limits.
    */
  var stdoutRaw: js.UndefOr[String | Null] = js.undefined
}
object SchemaBuildBazelRemoteExecutionV2ActionResult {
  
  inline def apply(): SchemaBuildBazelRemoteExecutionV2ActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ActionResult]
  }
  
  extension [Self <: SchemaBuildBazelRemoteExecutionV2ActionResult](x: Self) {
    
    inline def setExecutionMetadata(value: SchemaBuildBazelRemoteExecutionV2ExecutedActionMetadata): Self = StObject.set(x, "executionMetadata", value.asInstanceOf[js.Any])
    
    inline def setExecutionMetadataUndefined: Self = StObject.set(x, "executionMetadata", js.undefined)
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    inline def setExitCodeNull: Self = StObject.set(x, "exitCode", null)
    
    inline def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
    
    inline def setOutputDirectories(value: js.Array[SchemaBuildBazelRemoteExecutionV2OutputDirectory]): Self = StObject.set(x, "outputDirectories", value.asInstanceOf[js.Any])
    
    inline def setOutputDirectoriesUndefined: Self = StObject.set(x, "outputDirectories", js.undefined)
    
    inline def setOutputDirectoriesVarargs(value: SchemaBuildBazelRemoteExecutionV2OutputDirectory*): Self = StObject.set(x, "outputDirectories", js.Array(value*))
    
    inline def setOutputDirectorySymlinks(value: js.Array[SchemaBuildBazelRemoteExecutionV2OutputSymlink]): Self = StObject.set(x, "outputDirectorySymlinks", value.asInstanceOf[js.Any])
    
    inline def setOutputDirectorySymlinksUndefined: Self = StObject.set(x, "outputDirectorySymlinks", js.undefined)
    
    inline def setOutputDirectorySymlinksVarargs(value: SchemaBuildBazelRemoteExecutionV2OutputSymlink*): Self = StObject.set(x, "outputDirectorySymlinks", js.Array(value*))
    
    inline def setOutputFileSymlinks(value: js.Array[SchemaBuildBazelRemoteExecutionV2OutputSymlink]): Self = StObject.set(x, "outputFileSymlinks", value.asInstanceOf[js.Any])
    
    inline def setOutputFileSymlinksUndefined: Self = StObject.set(x, "outputFileSymlinks", js.undefined)
    
    inline def setOutputFileSymlinksVarargs(value: SchemaBuildBazelRemoteExecutionV2OutputSymlink*): Self = StObject.set(x, "outputFileSymlinks", js.Array(value*))
    
    inline def setOutputFiles(value: js.Array[SchemaBuildBazelRemoteExecutionV2OutputFile]): Self = StObject.set(x, "outputFiles", value.asInstanceOf[js.Any])
    
    inline def setOutputFilesUndefined: Self = StObject.set(x, "outputFiles", js.undefined)
    
    inline def setOutputFilesVarargs(value: SchemaBuildBazelRemoteExecutionV2OutputFile*): Self = StObject.set(x, "outputFiles", js.Array(value*))
    
    inline def setOutputSymlinks(value: js.Array[SchemaBuildBazelRemoteExecutionV2OutputSymlink]): Self = StObject.set(x, "outputSymlinks", value.asInstanceOf[js.Any])
    
    inline def setOutputSymlinksUndefined: Self = StObject.set(x, "outputSymlinks", js.undefined)
    
    inline def setOutputSymlinksVarargs(value: SchemaBuildBazelRemoteExecutionV2OutputSymlink*): Self = StObject.set(x, "outputSymlinks", js.Array(value*))
    
    inline def setStderrDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "stderrDigest", value.asInstanceOf[js.Any])
    
    inline def setStderrDigestUndefined: Self = StObject.set(x, "stderrDigest", js.undefined)
    
    inline def setStderrRaw(value: String): Self = StObject.set(x, "stderrRaw", value.asInstanceOf[js.Any])
    
    inline def setStderrRawNull: Self = StObject.set(x, "stderrRaw", null)
    
    inline def setStderrRawUndefined: Self = StObject.set(x, "stderrRaw", js.undefined)
    
    inline def setStdoutDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "stdoutDigest", value.asInstanceOf[js.Any])
    
    inline def setStdoutDigestUndefined: Self = StObject.set(x, "stdoutDigest", js.undefined)
    
    inline def setStdoutRaw(value: String): Self = StObject.set(x, "stdoutRaw", value.asInstanceOf[js.Any])
    
    inline def setStdoutRawNull: Self = StObject.set(x, "stdoutRaw", null)
    
    inline def setStdoutRawUndefined: Self = StObject.set(x, "stdoutRaw", js.undefined)
  }
}
