package typings.json8Patch

import typings.json8Patch.json8PatchBooleans.`false`
import typings.json8Patch.json8PatchBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var reversible: `true` = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(reversible: `true`): `0` = {
      val __obj = js.Dynamic.literal(reversible = reversible.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReversible(value: `true`): Self = StObject.set(x, "reversible", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Reversible extends StObject {
    
    var reversible: `false` = js.native
  }
  object Reversible {
    
    @scala.inline
    def apply(reversible: `false`): Reversible = {
      val __obj = js.Dynamic.literal(reversible = reversible.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reversible]
    }
    
    @scala.inline
    implicit class ReversibleMutableBuilder[Self <: Reversible] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setReversible(value: `false`): Self = StObject.set(x, "reversible", value.asInstanceOf[js.Any])
    }
  }
}
