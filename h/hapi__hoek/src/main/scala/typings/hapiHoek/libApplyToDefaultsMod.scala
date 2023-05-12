package typings.hapiHoek

import typings.hapiHoek.mod.applyToDefaults.Options
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libApplyToDefaultsMod {
  
  inline def apply[T /* <: js.Object */](defaults: Partial[T]): Partial[T] = ^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any]).asInstanceOf[Partial[T]]
  inline def apply[T /* <: js.Object */](defaults: Partial[T], source: Boolean): Partial[T] = (^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]
  inline def apply[T /* <: js.Object */](defaults: Partial[T], source: Boolean, options: Options): Partial[T] = (^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]
  inline def apply[T /* <: js.Object */](defaults: Partial[T], source: Null, options: Options): Partial[T] = (^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]
  inline def apply[T /* <: js.Object */](defaults: Partial[T], source: Partial[T]): Partial[T] = (^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]
  inline def apply[T /* <: js.Object */](defaults: Partial[T], source: Partial[T], options: Options): Partial[T] = (^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any], source.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Partial[T]]
  
  @JSImport("@hapi/hoek/lib/applyToDefaults", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
