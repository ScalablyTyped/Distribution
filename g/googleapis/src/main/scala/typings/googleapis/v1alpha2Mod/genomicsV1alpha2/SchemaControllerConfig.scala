package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stores the information that the controller will fetch from the server in
  * order to run. Should only be used by VMs created by the Pipelines Service
  * and not by end users.
  */
@js.native
trait SchemaControllerConfig extends js.Object {
  
  var cmd: js.UndefOr[String] = js.native
  
  var disks: js.UndefOr[StringDictionary[String]] = js.native
  
  var gcsLogPath: js.UndefOr[String] = js.native
  
  var gcsSinks: js.UndefOr[StringDictionary[SchemaRepeatedString]] = js.native
  
  var gcsSources: js.UndefOr[StringDictionary[SchemaRepeatedString]] = js.native
  
  var image: js.UndefOr[String] = js.native
  
  var machineType: js.UndefOr[String] = js.native
  
  var vars: js.UndefOr[StringDictionary[String]] = js.native
}
object SchemaControllerConfig {
  
  @scala.inline
  def apply(): SchemaControllerConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaControllerConfig]
  }
  
  @scala.inline
  implicit class SchemaControllerConfigOps[Self <: SchemaControllerConfig] (val x: Self) extends AnyVal {
    
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
    def setCmd(value: String): Self = this.set("cmd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCmd: Self = this.set("cmd", js.undefined)
    
    @scala.inline
    def setDisks(value: StringDictionary[String]): Self = this.set("disks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisks: Self = this.set("disks", js.undefined)
    
    @scala.inline
    def setGcsLogPath(value: String): Self = this.set("gcsLogPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsLogPath: Self = this.set("gcsLogPath", js.undefined)
    
    @scala.inline
    def setGcsSinks(value: StringDictionary[SchemaRepeatedString]): Self = this.set("gcsSinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsSinks: Self = this.set("gcsSinks", js.undefined)
    
    @scala.inline
    def setGcsSources(value: StringDictionary[SchemaRepeatedString]): Self = this.set("gcsSources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGcsSources: Self = this.set("gcsSources", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = this.set("machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMachineType: Self = this.set("machineType", js.undefined)
    
    @scala.inline
    def setVars(value: StringDictionary[String]): Self = this.set("vars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVars: Self = this.set("vars", js.undefined)
  }
}
