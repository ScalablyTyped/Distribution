package typings.lezerHighlight

import typings.lezerCommon.mod.NodeType
import typings.lezerHighlight.mod.Tag
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait All extends StObject {
    
    /**
      Add a style to _all_ tokens. Probably only useful in combination
      with `scope`.
      */
    var all: js.UndefOr[String] = js.undefined
    
    /**
      By default, highlighters apply to the entire document. You can
      scope them to a single language by providing the tree's
      [top](#common.NodeType.isTop) node type here.
      */
    var scope: js.UndefOr[js.Function1[/* node */ NodeType, Boolean]] = js.undefined
  }
  object All {
    
    inline def apply(): All = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[All]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: All] (val x: Self) extends AnyVal {
      
      inline def setAll(value: String): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setScope(value: /* node */ NodeType => Boolean): Self = StObject.set(x, "scope", js.Any.fromFunction1(value))
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
    }
  }
  
  trait Class extends StObject {
    
    var `class`: String
    
    var tag: Tag | js.Array[Tag]
  }
  object Class {
    
    inline def apply(`class`: String, tag: Tag | js.Array[Tag]): Class = {
      val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
      __obj.updateDynamic("class")(`class`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Class]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Class] (val x: Self) extends AnyVal {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setTag(value: Tag | js.Array[Tag]): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagVarargs(value: Tag*): Self = StObject.set(x, "tag", js.Array(value*))
    }
  }
  
  trait Inherit extends StObject {
    
    var inherit: Boolean
    
    var opaque: Boolean
    
    var tags: js.Array[Tag]
  }
  object Inherit {
    
    inline def apply(inherit: Boolean, opaque: Boolean, tags: js.Array[Tag]): Inherit = {
      val __obj = js.Dynamic.literal(inherit = inherit.asInstanceOf[js.Any], opaque = opaque.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Inherit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Inherit] (val x: Self) extends AnyVal {
      
      inline def setInherit(value: Boolean): Self = StObject.set(x, "inherit", value.asInstanceOf[js.Any])
      
      inline def setOpaque(value: Boolean): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[Tag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
}
