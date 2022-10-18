package typings.grammarkdown

import typings.grammarkdown.distTokensMod.SyntaxKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `dist@TestsMatchersMod` {
  
  object global {
    
    object jest {
      
      trait Matchers[R] extends StObject {
        
        def toBeSyntaxKind(actual: SyntaxKind): R
      }
      object Matchers {
        
        inline def apply[R](toBeSyntaxKind: SyntaxKind => R): Matchers[R] = {
          val __obj = js.Dynamic.literal(toBeSyntaxKind = js.Any.fromFunction1(toBeSyntaxKind))
          __obj.asInstanceOf[Matchers[R]]
        }
        
        extension [Self <: Matchers[?], R](x: Self & Matchers[R]) {
          
          inline def setToBeSyntaxKind(value: SyntaxKind => R): Self = StObject.set(x, "toBeSyntaxKind", js.Any.fromFunction1(value))
        }
      }
    }
  }
}
