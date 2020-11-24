package typings.luminoProperties.mod.AttachedProperty

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@lumino/properties", "AttachedProperty.clearData")
@js.native
object clearData extends js.Object {
  
  /**
    * Clear the stored property data for the given owner.
    *
    * @param owner - The property owner of interest.
    *
    * #### Notes
    * This will clear all property values for the owner, but it will
    * **not** run the change notification for any of the properties.
    */
  def apply(owner: js.Any): Unit = js.native
}
