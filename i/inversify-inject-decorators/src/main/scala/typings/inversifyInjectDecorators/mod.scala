package typings.inversifyInjectDecorators

import typings.inversify.interfacesMod.interfaces.Container
import typings.inversifyInjectDecorators.anon.LazyInject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("inversify-inject-decorators", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(container: Container): LazyInject = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(container.asInstanceOf[js.Any]).asInstanceOf[LazyInject]
  @scala.inline
  def default(container: Container, doCache: Boolean): LazyInject = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(container.asInstanceOf[js.Any], doCache.asInstanceOf[js.Any])).asInstanceOf[LazyInject]
}
