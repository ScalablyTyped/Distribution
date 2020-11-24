package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A bounding polygon for the detected image annotation.
  */
@js.native
trait SchemaBoundingPoly extends js.Object {
  
  /**
    * The bounding polygon normalized vertices.
    */
  var normalizedVertices: js.UndefOr[js.Array[SchemaNormalizedVertex]] = js.native
  
  /**
    * The bounding polygon vertices.
    */
  var vertices: js.UndefOr[js.Array[SchemaVertex]] = js.native
}
object SchemaBoundingPoly {
  
  @scala.inline
  def apply(): SchemaBoundingPoly = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaBoundingPoly]
  }
  
  @scala.inline
  implicit class SchemaBoundingPolyOps[Self <: SchemaBoundingPoly] (val x: Self) extends AnyVal {
    
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
    def setNormalizedVerticesVarargs(value: SchemaNormalizedVertex*): Self = this.set("normalizedVertices", js.Array(value :_*))
    
    @scala.inline
    def setNormalizedVertices(value: js.Array[SchemaNormalizedVertex]): Self = this.set("normalizedVertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizedVertices: Self = this.set("normalizedVertices", js.undefined)
    
    @scala.inline
    def setVerticesVarargs(value: SchemaVertex*): Self = this.set("vertices", js.Array(value :_*))
    
    @scala.inline
    def setVertices(value: js.Array[SchemaVertex]): Self = this.set("vertices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertices: Self = this.set("vertices", js.undefined)
  }
}
