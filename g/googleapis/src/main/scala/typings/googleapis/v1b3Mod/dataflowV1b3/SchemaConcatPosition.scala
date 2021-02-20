package typings.googleapis.v1b3Mod.dataflowV1b3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A position that encapsulates an inner position and an index for the inner
  * position. A ConcatPosition can be used by a reader of a source that
  * encapsulates a set of other sources.
  */
@js.native
trait SchemaConcatPosition extends StObject {
  
  /**
    * Index of the inner source.
    */
  var index: js.UndefOr[Double] = js.native
  
  /**
    * Position within the inner source.
    */
  var position: js.UndefOr[SchemaPosition] = js.native
}
object SchemaConcatPosition {
  
  @scala.inline
  def apply(): SchemaConcatPosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaConcatPosition]
  }
  
  @scala.inline
  implicit class SchemaConcatPositionMutableBuilder[Self <: SchemaConcatPosition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    @scala.inline
    def setPosition(value: SchemaPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
