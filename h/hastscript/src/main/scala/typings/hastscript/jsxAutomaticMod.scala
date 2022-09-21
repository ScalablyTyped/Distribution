package typings.hastscript

import org.scalablytyped.runtime.StringDictionary
import typings.hastscript.anon.Children
import typings.hastscript.coreMod.HProperties
import typings.hastscript.coreMod.HResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsxAutomaticMod {
  
  object JSX {
    
    /**
      * This defines the return value of JSX syntax.
      */
    type Element = HResult
    
    /**
      * The key of this interface defines as what prop children are passed.
      */
    trait ElementChildrenAttribute extends StObject {
      
      /**
        * Only the key matters, not the value.
        */
      var children: js.UndefOr[scala.Nothing] = js.undefined
    }
    
    /**
      * This disallows the use of functional components.
      */
    type IntrinsicAttributes = scala.Nothing
    
    /**
      * This defines the prop types for known elements.
      *
      * For `hastscript` this defines any string may be used in combination with `hast` `Properties`.
      *
      * This **must** be an interface.
      */
    // eslint-disable-next-line @typescript-eslint/consistent-indexed-object-style
    type IntrinsicElements = StringDictionary[HProperties | Children]
  }
}
