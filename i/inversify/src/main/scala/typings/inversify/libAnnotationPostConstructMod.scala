package typings.inversify

import typings.inversify.anon.Constructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnnotationPostConstructMod {
  
  @JSImport("inversify/lib/annotation/post_construct", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def postConstruct(): js.Function2[/* target */ Constructor, /* propertyKey */ String, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("postConstruct")().asInstanceOf[js.Function2[/* target */ Constructor, /* propertyKey */ String, Unit]]
}
