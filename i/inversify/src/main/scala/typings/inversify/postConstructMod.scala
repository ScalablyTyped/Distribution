package typings.inversify

import typings.std.PropertyDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object postConstructMod {
  
  @JSImport("inversify/dts/annotation/post_construct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def postConstruct(): js.Function3[
    /* target */ js.Any, 
    /* propertyKey */ String, 
    /* descriptor */ PropertyDescriptor, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("postConstruct")().asInstanceOf[js.Function3[
    /* target */ js.Any, 
    /* propertyKey */ String, 
    /* descriptor */ PropertyDescriptor, 
    Unit
  ]]
}
