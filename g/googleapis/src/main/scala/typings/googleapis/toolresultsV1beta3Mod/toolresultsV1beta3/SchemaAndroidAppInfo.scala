package typings.googleapis.toolresultsV1beta3Mod.toolresultsV1beta3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Android app information.
  */
trait SchemaAndroidAppInfo extends StObject {
  
  /**
    * The name of the app. Optional
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * The package name of the app. Required.
    */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
    * The internal version code of the app. Optional.
    */
  var versionCode: js.UndefOr[String] = js.undefined
  
  /**
    * The version name of the app. Optional.
    */
  var versionName: js.UndefOr[String] = js.undefined
}
object SchemaAndroidAppInfo {
  
  @scala.inline
  def apply(): SchemaAndroidAppInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAndroidAppInfo]
  }
  
  @scala.inline
  implicit class SchemaAndroidAppInfoMutableBuilder[Self <: SchemaAndroidAppInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    @scala.inline
    def setVersionCode(value: String): Self = StObject.set(x, "versionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionCodeUndefined: Self = StObject.set(x, "versionCode", js.undefined)
    
    @scala.inline
    def setVersionName(value: String): Self = StObject.set(x, "versionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionNameUndefined: Self = StObject.set(x, "versionName", js.undefined)
  }
}
