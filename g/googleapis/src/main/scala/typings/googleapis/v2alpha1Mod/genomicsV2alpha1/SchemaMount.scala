package typings.googleapis.v2alpha1Mod.genomicsV2alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Carries information about a particular disk mount inside a container.
  */
trait SchemaMount extends StObject {
  
  /**
    * The name of the disk to mount, as specified in the resources section.
    */
  var disk: js.UndefOr[String] = js.undefined
  
  /**
    * The path to mount the disk inside the container.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * If true, the disk is mounted read-only inside the container.
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
}
object SchemaMount {
  
  @scala.inline
  def apply(): SchemaMount = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMount]
  }
  
  @scala.inline
  implicit class SchemaMountMutableBuilder[Self <: SchemaMount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisk(value: String): Self = StObject.set(x, "disk", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDiskUndefined: Self = StObject.set(x, "disk", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
  }
}
