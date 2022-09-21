package typings.inferno.typesMod.Inferno

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.inferno.anon.Children
import typings.inferno.typesMod.IComponent
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentClass[P]
  extends StObject
     with Instantiable0[IComponent[P, ComponentState]]
     with Instantiable1[/* props */ Children & P, IComponent[P, ComponentState]]
     with Instantiable2[
      (/* props */ Children & P) | (/* props */ Unit), 
      /* context */ Any, 
      IComponent[P, ComponentState]
    ] {
  
  var defaultProps: js.UndefOr[Partial[P]] = js.native
}
