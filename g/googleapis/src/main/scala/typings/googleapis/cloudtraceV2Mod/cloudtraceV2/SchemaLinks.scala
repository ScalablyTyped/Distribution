package typings.googleapis.cloudtraceV2Mod.cloudtraceV2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A collection of links, which are references from this span to a span in the
  * same or different trace.
  */
trait SchemaLinks extends StObject {
  
  /**
    * The number of dropped links after the maximum size was enforced. If this
    * value is 0, then no links were dropped.
    */
  var droppedLinksCount: js.UndefOr[Double] = js.undefined
  
  /**
    * A collection of links.
    */
  var link: js.UndefOr[js.Array[SchemaLink]] = js.undefined
}
object SchemaLinks {
  
  @scala.inline
  def apply(): SchemaLinks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaLinks]
  }
  
  @scala.inline
  implicit class SchemaLinksMutableBuilder[Self <: SchemaLinks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDroppedLinksCount(value: Double): Self = StObject.set(x, "droppedLinksCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDroppedLinksCountUndefined: Self = StObject.set(x, "droppedLinksCount", js.undefined)
    
    @scala.inline
    def setLink(value: js.Array[SchemaLink]): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
    
    @scala.inline
    def setLinkVarargs(value: SchemaLink*): Self = StObject.set(x, "link", js.Array(value :_*))
  }
}
