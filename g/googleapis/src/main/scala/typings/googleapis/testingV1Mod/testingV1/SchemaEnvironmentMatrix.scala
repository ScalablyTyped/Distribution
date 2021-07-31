package typings.googleapis.testingV1Mod.testingV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The matrix of environments in which the test is to be executed.
  */
trait SchemaEnvironmentMatrix extends StObject {
  
  /**
    * A list of Android devices; the test will be run only on the specified
    * devices.
    */
  var androidDeviceList: js.UndefOr[SchemaAndroidDeviceList] = js.undefined
  
  /**
    * A matrix of Android devices.
    */
  var androidMatrix: js.UndefOr[SchemaAndroidMatrix] = js.undefined
  
  /**
    * A list of iOS devices.
    */
  var iosDeviceList: js.UndefOr[SchemaIosDeviceList] = js.undefined
}
object SchemaEnvironmentMatrix {
  
  @scala.inline
  def apply(): SchemaEnvironmentMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironmentMatrix]
  }
  
  @scala.inline
  implicit class SchemaEnvironmentMatrixMutableBuilder[Self <: SchemaEnvironmentMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndroidDeviceList(value: SchemaAndroidDeviceList): Self = StObject.set(x, "androidDeviceList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidDeviceListUndefined: Self = StObject.set(x, "androidDeviceList", js.undefined)
    
    @scala.inline
    def setAndroidMatrix(value: SchemaAndroidMatrix): Self = StObject.set(x, "androidMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndroidMatrixUndefined: Self = StObject.set(x, "androidMatrix", js.undefined)
    
    @scala.inline
    def setIosDeviceList(value: SchemaIosDeviceList): Self = StObject.set(x, "iosDeviceList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIosDeviceListUndefined: Self = StObject.set(x, "iosDeviceList", js.undefined)
  }
}
