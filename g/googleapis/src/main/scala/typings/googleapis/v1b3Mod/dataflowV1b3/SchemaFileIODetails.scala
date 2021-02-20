package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata for a File connector used by the job.
  */
@js.native
trait SchemaFileIODetails extends StObject {
  
  /**
    * File Pattern used to access files by the connector.
    */
  var filePattern: js.UndefOr[String] = js.native
}
object SchemaFileIODetails {
  
  @scala.inline
  def apply(): SchemaFileIODetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFileIODetails]
  }
  
  @scala.inline
  implicit class SchemaFileIODetailsMutableBuilder[Self <: SchemaFileIODetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilePattern(value: String): Self = StObject.set(x, "filePattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePatternUndefined: Self = StObject.set(x, "filePattern", js.undefined)
  }
}
