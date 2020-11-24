package typings.jsts.jsts.io

import typings.jsts.jsts.geom.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoJSONWriter extends js.Object {
  
  /**
    * Converts a <code>Geometry</code> to its GeoJSON representation.
    *
    * @param {jsts.geom.Geometry}
    *          geometry a <code>Geometry</code> to process.
    * @return {Object} The GeoJSON representation of the Geometry.
    */
  def write(geometry: Geometry): js.Object = js.native
}
object GeoJSONWriter {
  
  @scala.inline
  def apply(write: Geometry => js.Object): GeoJSONWriter = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[GeoJSONWriter]
  }
  
  @scala.inline
  implicit class GeoJSONWriterOps[Self <: GeoJSONWriter] (val x: Self) extends AnyVal {
    
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
    def setWrite(value: Geometry => js.Object): Self = this.set("write", js.Any.fromFunction1(value))
  }
}
