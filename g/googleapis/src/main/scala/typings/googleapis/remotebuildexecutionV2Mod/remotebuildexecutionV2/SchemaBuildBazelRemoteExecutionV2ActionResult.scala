package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An ActionResult represents the result of an Action being run.
  */
@js.native
trait SchemaBuildBazelRemoteExecutionV2ActionResult extends StObject {
  
  /**
    * The details of the execution that originally produced this result.
    */
  var executionMetadata: js.UndefOr[SchemaBuildBazelRemoteExecutionV2ExecutedActionMetadata] = js.native
  
  /**
    * The exit code of the command.
    */
  var exitCode: js.UndefOr[Double] = js.native
  
  /**
    * The output directories of the action. For each output directory requested
    * in the `output_directories` field of the Action, if the corresponding
    * directory existed after the action completed, a single entry will be
    * present in the output list, which will contain the digest of a Tree
    * message containing the directory tree, and the path equal exactly to the
    * corresponding Action output_directories member.  As an example, suppose
    * the Action had an output directory `a/b/dir` and the execution produced
    * the following contents in `a/b/dir`: a file named `bar` and a directory
    * named `foo` with an executable file named `baz`. Then, output_directory
    * will contain (hashes shortened for readability):  ```json //
    * OutputDirectory proto: {   path: &quot;a/b/dir&quot;   tree_digest: {
    * hash: &quot;4a73bc9d03...&quot;,     size: 55   } } // Tree proto with
    * hash &quot;4a73bc9d03...&quot; and size 55: {   root: {     files: [ {
    * name: &quot;bar&quot;,         digest: {           hash:
    * &quot;4a73bc9d03...&quot;,           size: 65534         }       }     ],
    * directories: [       {         name: &quot;foo&quot;,         digest: {
    * hash: &quot;4cf2eda940...&quot;,           size: 43         }       } ]
    * }   children : {     // (Directory proto with hash
    * &quot;4cf2eda940...&quot; and size 43)     files: [       {         name:
    * &quot;baz&quot;,         digest: {           hash:
    * &quot;b2c941073e...&quot;,           size: 1294,         },
    * is_executable: true       }     ]   } } ```
    */
  var outputDirectories: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2OutputDirectory]] = js.native
  
  /**
    * The output directories of the action that are symbolic links to other
    * directories. Those may be links to other output directories, or input
    * directories, or even absolute paths outside of the working directory, if
    * the server supports SymlinkAbsolutePathStrategy.ALLOWED. For each output
    * directory requested in the `output_directories` field of the Action, if
    * the directory file existed after the action completed, a single entry
    * will be present either in this field, or in the `output_directories`
    * field, if the directory was not a symbolic link.  If the action does not
    * produce the requested output, or produces a file where a directory is
    * expected or vice versa, then that output will be omitted from the list.
    * The server is free to arrange the output list as desired; clients MUST
    * NOT assume that the output list is sorted.
    */
  var outputDirectorySymlinks: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2OutputSymlink]] = js.native
  
  /**
    * The output files of the action that are symbolic links to other files.
    * Those may be links to other output files, or input files, or even
    * absolute paths outside of the working directory, if the server supports
    * SymlinkAbsolutePathStrategy.ALLOWED. For each output file requested in
    * the `output_files` field of the Action, if the corresponding file existed
    * after the action completed, a single entry will be present either in this
    * field, or in the `output_files` field, if the file was not a symbolic
    * link.  If the action does not produce the requested output, or produces a
    * directory where a regular file is expected or vice versa, then that
    * output will be omitted from the list. The server is free to arrange the
    * output list as desired; clients MUST NOT assume that the output list is
    * sorted.
    */
  var outputFileSymlinks: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2OutputSymlink]] = js.native
  
  /**
    * The output files of the action. For each output file requested in the
    * `output_files` field of the Action, if the corresponding file existed
    * after the action completed, a single entry will be present either in this
    * field, or in the output_file_symlinks field, if the file was a symbolic
    * link to another file.  If the action does not produce the requested
    * output, or produces a directory where a regular file is expected or vice
    * versa, then that output will be omitted from the list. The server is free
    * to arrange the output list as desired; clients MUST NOT assume that the
    * output list is sorted.
    */
  var outputFiles: js.UndefOr[js.Array[SchemaBuildBazelRemoteExecutionV2OutputFile]] = js.native
  
  /**
    * The digest for a blob containing the standard error of the action, which
    * can be retrieved from the ContentAddressableStorage. See `stderr_raw` for
    * when this will be set.
    */
  var stderrDigest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.native
  
  /**
    * The standard error buffer of the action. The server will determine, based
    * on the size of the buffer, whether to return it in raw form or to return
    * a digest in `stderr_digest` that points to the buffer. If neither is set,
    * then the buffer is empty. The client SHOULD NOT assume it will get one of
    * the raw buffer or a digest on any given request and should be prepared to
    * handle either.
    */
  var stderrRaw: js.UndefOr[String] = js.native
  
  /**
    * The digest for a blob containing the standard output of the action, which
    * can be retrieved from the ContentAddressableStorage. See `stdout_raw` for
    * when this will be set.
    */
  var stdoutDigest: js.UndefOr[SchemaBuildBazelRemoteExecutionV2Digest] = js.native
  
  /**
    * The standard output buffer of the action. The server will determine,
    * based on the size of the buffer, whether to return it in raw form or to
    * return a digest in `stdout_digest` that points to the buffer. If neither
    * is set, then the buffer is empty. The client SHOULD NOT assume it will
    * get one of the raw buffer or a digest on any given request and should be
    * prepared to handle either.
    */
  var stdoutRaw: js.UndefOr[String] = js.native
}
object SchemaBuildBazelRemoteExecutionV2ActionResult {
  
  @scala.inline
  def apply(): SchemaBuildBazelRemoteExecutionV2ActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBuildBazelRemoteExecutionV2ActionResult]
  }
  
  @scala.inline
  implicit class SchemaBuildBazelRemoteExecutionV2ActionResultMutableBuilder[Self <: SchemaBuildBazelRemoteExecutionV2ActionResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionMetadata(value: SchemaBuildBazelRemoteExecutionV2ExecutedActionMetadata): Self = StObject.set(x, "executionMetadata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionMetadataUndefined: Self = StObject.set(x, "executionMetadata", js.undefined)
    
    @scala.inline
    def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
    
    @scala.inline
    def setOutputDirectories(value: js.Array[SchemaBuildBazelRemoteExecutionV2OutputDirectory]): Self = StObject.set(x, "outputDirectories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDirectoriesUndefined: Self = StObject.set(x, "outputDirectories", js.undefined)
    
    @scala.inline
    def setOutputDirectoriesVarargs(value: SchemaBuildBazelRemoteExecutionV2OutputDirectory*): Self = StObject.set(x, "outputDirectories", js.Array(value :_*))
    
    @scala.inline
    def setOutputDirectorySymlinks(value: js.Array[SchemaBuildBazelRemoteExecutionV2OutputSymlink]): Self = StObject.set(x, "outputDirectorySymlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputDirectorySymlinksUndefined: Self = StObject.set(x, "outputDirectorySymlinks", js.undefined)
    
    @scala.inline
    def setOutputDirectorySymlinksVarargs(value: SchemaBuildBazelRemoteExecutionV2OutputSymlink*): Self = StObject.set(x, "outputDirectorySymlinks", js.Array(value :_*))
    
    @scala.inline
    def setOutputFileSymlinks(value: js.Array[SchemaBuildBazelRemoteExecutionV2OutputSymlink]): Self = StObject.set(x, "outputFileSymlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFileSymlinksUndefined: Self = StObject.set(x, "outputFileSymlinks", js.undefined)
    
    @scala.inline
    def setOutputFileSymlinksVarargs(value: SchemaBuildBazelRemoteExecutionV2OutputSymlink*): Self = StObject.set(x, "outputFileSymlinks", js.Array(value :_*))
    
    @scala.inline
    def setOutputFiles(value: js.Array[SchemaBuildBazelRemoteExecutionV2OutputFile]): Self = StObject.set(x, "outputFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputFilesUndefined: Self = StObject.set(x, "outputFiles", js.undefined)
    
    @scala.inline
    def setOutputFilesVarargs(value: SchemaBuildBazelRemoteExecutionV2OutputFile*): Self = StObject.set(x, "outputFiles", js.Array(value :_*))
    
    @scala.inline
    def setStderrDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "stderrDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStderrDigestUndefined: Self = StObject.set(x, "stderrDigest", js.undefined)
    
    @scala.inline
    def setStderrRaw(value: String): Self = StObject.set(x, "stderrRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStderrRawUndefined: Self = StObject.set(x, "stderrRaw", js.undefined)
    
    @scala.inline
    def setStdoutDigest(value: SchemaBuildBazelRemoteExecutionV2Digest): Self = StObject.set(x, "stdoutDigest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdoutDigestUndefined: Self = StObject.set(x, "stdoutDigest", js.undefined)
    
    @scala.inline
    def setStdoutRaw(value: String): Self = StObject.set(x, "stdoutRaw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStdoutRawUndefined: Self = StObject.set(x, "stdoutRaw", js.undefined)
  }
}
