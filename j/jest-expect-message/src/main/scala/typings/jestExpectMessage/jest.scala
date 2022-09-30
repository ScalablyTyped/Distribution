package typings.jestExpectMessage

import typings.jestExpectMessage.anon.ShowMatcherMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jest {
  
  type Expect = js.Function3[
    /* actual */ Any, 
    /* message */ js.UndefOr[String], 
    /* options */ js.UndefOr[ShowMatcherMessage], 
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify JestMatchers<T> */ Any
  ]
}
