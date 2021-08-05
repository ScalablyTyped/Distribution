package typings.googleapis.remotebuildexecutionV1alphaMod.remotebuildexecutionV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An ActionResult represents the result of an Action being run.
  */
trait SchemaGoogleDevtoolsRemoteexecutionV1testActionResult extends StObject {
  
  /**
    * The exit code of the command.
    */
  var exitCode: js.UndefOr[Double] = js.undefined
  
  /**
    * The output directories of the action. For each output directory requested
    * in the `output_directories` field of the Action, if the corresponding
    * directory existed after the action completed, a single entry will be
    * present in the output list, which will contain the digest of a Tree
    * message containing the directory tree, and the path equal exactly to the
    * corresponding Action output_directories member. As an example, suppose
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
  var outputDirectories: js.UndefOr[js.Array[SchemaGoogleDevtoolsRemoteexecutionV1testOutputDirectory]] = js.undefined
  
  /**
    * The output files of the action. For each output file requested in the
    * `output_files` field of the Action, if the corresponding file existed
    * after the action completed, a single entry will be present in the output
    * list.  If the action does not produce the requested output, or produces a
    * directory where a regular file is expected or vice versa, then that
    * output will be omitted from the list. The server is free to arrange the
    * output list as desired; clients MUST NOT assume that the output list is
    * sorted.
    */
  var outputFiles: js.UndefOr[js.Array[SchemaGoogleDevtoolsRemoteexecutionV1testOutputFile]] = js.undefined
  
  /**
    * The digest for a blob containing the standard error of the action, which
    * can be retrieved from the ContentAddressableStorage. See `stderr_raw` for
    * when this will be set.
    */
  var stderrDigest: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testDigest] = js.undefined
  
  /**
    * The standard error buffer of the action. The server will determine, based
    * on the size of the buffer, whether to return it in raw form or to return
    * a digest in `stderr_digest` that points to the buffer. If neither is set,
    * then the buffer is empty. The client SHOULD NOT assume it will get one of
    * the raw buffer or a digest on any given request and should be prepared to
    * handle either.
    */
  var stderrRaw: js.UndefOr[String] = js.undefined
  
  /**
    * The digest for a blob containing the standard output of the action, which
    * can be retrieved from the ContentAddressableStorage. See `stdout_raw` for
    * when this will be set.
    */
  var stdoutDigest: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testDigest] = js.undefined
  
  /**
    * The standard output buffer of the action. The server will determine,
    * based on the size of the buffer, whether to return it in raw form or to
    * return a digest in `stdout_digest` that points to the buffer. If neither
    * is set, then the buffer is empty. The client SHOULD NOT assume it will
    * get one of the raw buffer or a digest on any given request and should be
    * prepared to handle either.
    */
  var stdoutRaw: js.UndefOr[String] = js.undefined
}
object SchemaGoogleDevtoolsRemoteexecutionV1testActionResult {
  
  inline def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testActionResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testActionResult]
  }
  
  extension [Self <: SchemaGoogleDevtoolsRemoteexecutionV1testActionResult](x: Self) {
    
    inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
    
    inline def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
    
    inline def setOutputDirectories(value: js.Array[SchemaGoogleDevtoolsRemoteexecutionV1testOutputDirectory]): Self = StObject.set(x, "outputDirectories", value.asInstanceOf[js.Any])
    
    inline def setOutputDirectoriesUndefined: Self = StObject.set(x, "outputDirectories", js.undefined)
    
    inline def setOutputDirectoriesVarargs(value: SchemaGoogleDevtoolsRemoteexecutionV1testOutputDirectory*): Self = StObject.set(x, "outputDirectories", js.Array(value :_*))
    
    inline def setOutputFiles(value: js.Array[SchemaGoogleDevtoolsRemoteexecutionV1testOutputFile]): Self = StObject.set(x, "outputFiles", value.asInstanceOf[js.Any])
    
    inline def setOutputFilesUndefined: Self = StObject.set(x, "outputFiles", js.undefined)
    
    inline def setOutputFilesVarargs(value: SchemaGoogleDevtoolsRemoteexecutionV1testOutputFile*): Self = StObject.set(x, "outputFiles", js.Array(value :_*))
    
    inline def setStderrDigest(value: SchemaGoogleDevtoolsRemoteexecutionV1testDigest): Self = StObject.set(x, "stderrDigest", value.asInstanceOf[js.Any])
    
    inline def setStderrDigestUndefined: Self = StObject.set(x, "stderrDigest", js.undefined)
    
    inline def setStderrRaw(value: String): Self = StObject.set(x, "stderrRaw", value.asInstanceOf[js.Any])
    
    inline def setStderrRawUndefined: Self = StObject.set(x, "stderrRaw", js.undefined)
    
    inline def setStdoutDigest(value: SchemaGoogleDevtoolsRemoteexecutionV1testDigest): Self = StObject.set(x, "stdoutDigest", value.asInstanceOf[js.Any])
    
    inline def setStdoutDigestUndefined: Self = StObject.set(x, "stdoutDigest", js.undefined)
    
    inline def setStdoutRaw(value: String): Self = StObject.set(x, "stdoutRaw", value.asInstanceOf[js.Any])
    
    inline def setStdoutRawUndefined: Self = StObject.set(x, "stdoutRaw", js.undefined)
  }
}
