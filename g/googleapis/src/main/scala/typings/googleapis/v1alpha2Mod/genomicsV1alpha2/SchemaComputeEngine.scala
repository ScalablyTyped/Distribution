package typings.googleapis.v1alpha2Mod.genomicsV1alpha2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Describes a Compute Engine resource that is being managed by a running
  * pipeline.
  */
trait SchemaComputeEngine extends StObject {
  
  /**
    * The names of the disks that were created for this pipeline.
    */
  var diskNames: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The instance on which the operation is running.
    */
  var instanceName: js.UndefOr[String] = js.undefined
  
  /**
    * The machine type of the instance.
    */
  var machineType: js.UndefOr[String] = js.undefined
  
  /**
    * The availability zone in which the instance resides.
    */
  var zone: js.UndefOr[String] = js.undefined
}
object SchemaComputeEngine {
  
  @scala.inline
  def apply(): SchemaComputeEngine = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaComputeEngine]
  }
  
  @scala.inline
  implicit class SchemaComputeEngineMutableBuilder[Self <: SchemaComputeEngine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDiskNames(value: js.Array[String]): Self = StObject.set(x, "diskNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskNamesUndefined: Self = StObject.set(x, "diskNames", js.undefined)
    
    @scala.inline
    def setDiskNamesVarargs(value: String*): Self = StObject.set(x, "diskNames", js.Array(value :_*))
    
    @scala.inline
    def setInstanceName(value: String): Self = StObject.set(x, "instanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceNameUndefined: Self = StObject.set(x, "instanceName", js.undefined)
    
    @scala.inline
    def setMachineType(value: String): Self = StObject.set(x, "machineType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMachineTypeUndefined: Self = StObject.set(x, "machineType", js.undefined)
    
    @scala.inline
    def setZone(value: String): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
  }
}
