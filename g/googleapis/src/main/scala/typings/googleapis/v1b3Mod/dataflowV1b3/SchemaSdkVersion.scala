package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The version of the SDK used to run the job.
  */
trait SchemaSdkVersion extends StObject {
  
  /**
    * The support status for this SDK version.
    */
  var sdkSupportStatus: js.UndefOr[String] = js.undefined
  
  /**
    * The version of the SDK used to run the job.
    */
  var version: js.UndefOr[String] = js.undefined
  
  /**
    * A readable string describing the version of the SDK.
    */
  var versionDisplayName: js.UndefOr[String] = js.undefined
}
object SchemaSdkVersion {
  
  @scala.inline
  def apply(): SchemaSdkVersion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSdkVersion]
  }
  
  @scala.inline
  implicit class SchemaSdkVersionMutableBuilder[Self <: SchemaSdkVersion] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSdkSupportStatus(value: String): Self = StObject.set(x, "sdkSupportStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSdkSupportStatusUndefined: Self = StObject.set(x, "sdkSupportStatus", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionDisplayName(value: String): Self = StObject.set(x, "versionDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionDisplayNameUndefined: Self = StObject.set(x, "versionDisplayName", js.undefined)
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
