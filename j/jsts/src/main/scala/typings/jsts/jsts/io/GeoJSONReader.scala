package typings.jsts.jsts.io

import typings.jsts.jsts.geom.Geometry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoJSONReader extends js.Object {
  
  /**
    * Converts a GeoJSON to its <code>Geometry</code> representation.
    *
    * @param {Object} The GeoJSON representation of the Geometry.
    * @return {jsts.geom.Geometry}
    * geometry a <code>Geometry</code> to process.
    */
  def read(geometry: js.Object): Geometry = js.native
}
object GeoJSONReader {
  
  @scala.inline
  def apply(read: js.Object => Geometry): GeoJSONReader = {
    val __obj = js.Dynamic.literal(read = js.Any.fromFunction1(read))
    __obj.asInstanceOf[GeoJSONReader]
  }
  
  @scala.inline
  implicit class GeoJSONReaderOps[Self <: GeoJSONReader] (val x: Self) extends AnyVal {
    
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
    def setRead(value: js.Object => Geometry): Self = this.set("read", js.Any.fromFunction1(value))
  }
}
