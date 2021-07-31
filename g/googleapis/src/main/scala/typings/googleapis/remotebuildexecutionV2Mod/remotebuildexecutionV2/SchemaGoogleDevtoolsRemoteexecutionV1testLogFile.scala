package typings.googleapis.remotebuildexecutionV2Mod.remotebuildexecutionV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A `LogFile` is a log stored in the CAS.
  */
trait SchemaGoogleDevtoolsRemoteexecutionV1testLogFile extends StObject {
  
  /**
    * The digest of the log contents.
    */
  var digest: js.UndefOr[SchemaGoogleDevtoolsRemoteexecutionV1testDigest] = js.undefined
  
  /**
    * This is a hint as to the purpose of the log, and is set to true if the
    * log is human-readable text that can be usefully displayed to a user, and
    * false otherwise. For instance, if a command-line client wishes to print
    * the server logs to the terminal for a failed action, this allows it to
    * avoid displaying a binary file.
    */
  var humanReadable: js.UndefOr[Boolean] = js.undefined
}
object SchemaGoogleDevtoolsRemoteexecutionV1testLogFile {
  
  @scala.inline
  def apply(): SchemaGoogleDevtoolsRemoteexecutionV1testLogFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleDevtoolsRemoteexecutionV1testLogFile]
  }
  
  @scala.inline
  implicit class SchemaGoogleDevtoolsRemoteexecutionV1testLogFileMutableBuilder[Self <: SchemaGoogleDevtoolsRemoteexecutionV1testLogFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDigest(value: SchemaGoogleDevtoolsRemoteexecutionV1testDigest): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDigestUndefined: Self = StObject.set(x, "digest", js.undefined)
    
    @scala.inline
    def setHumanReadable(value: Boolean): Self = StObject.set(x, "humanReadable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHumanReadableUndefined: Self = StObject.set(x, "humanReadable", js.undefined)
  }
}
