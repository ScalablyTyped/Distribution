package typings.googleapis.testingV1Mod.testingV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The matrix of environments in which the test is to be executed.
  */
@js.native
trait SchemaEnvironmentMatrix extends js.Object {
  
  /**
    * A list of Android devices; the test will be run only on the specified
    * devices.
    */
  var androidDeviceList: js.UndefOr[SchemaAndroidDeviceList] = js.native
  
  /**
    * A matrix of Android devices.
    */
  var androidMatrix: js.UndefOr[SchemaAndroidMatrix] = js.native
  
  /**
    * A list of iOS devices.
    */
  var iosDeviceList: js.UndefOr[SchemaIosDeviceList] = js.native
}
object SchemaEnvironmentMatrix {
  
  @scala.inline
  def apply(): SchemaEnvironmentMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaEnvironmentMatrix]
  }
  
  @scala.inline
  implicit class SchemaEnvironmentMatrixOps[Self <: SchemaEnvironmentMatrix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAndroidDeviceList(value: SchemaAndroidDeviceList): Self = this.set("androidDeviceList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidDeviceList: Self = this.set("androidDeviceList", js.undefined)
    
    @scala.inline
    def setAndroidMatrix(value: SchemaAndroidMatrix): Self = this.set("androidMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndroidMatrix: Self = this.set("androidMatrix", js.undefined)
    
    @scala.inline
    def setIosDeviceList(value: SchemaIosDeviceList): Self = this.set("iosDeviceList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIosDeviceList: Self = this.set("iosDeviceList", js.undefined)
  }
}
