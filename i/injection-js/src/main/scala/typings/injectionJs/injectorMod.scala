package typings.injectionJs

import typings.injectionJs.injectionTokenMod.InjectionToken
import typings.injectionJs.typeMod.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object injectorMod {
  
  @JSImport("injection-js/injector", "Injector")
  @js.native
  abstract class Injector () extends StObject {
    
    /**
      * @deprecated from v4.0.0 use Type<T> or InjectionToken<T>
      * @suppress {duplicate}
      */
    def get(token: Any): Any = js.native
    def get(token: Any, notFoundValue: Any): Any = js.native
    def get[T](token: InjectionToken[T]): T = js.native
    def get[T](token: InjectionToken[T], notFoundValue: T): T = js.native
    /**
      * Retrieves an instance from the injector based on the provided token.
      * If not found:
      * - Throws {@link NoProviderError} if no `notFoundValue` that is not equal to
      * Injector.THROW_IF_NOT_FOUND is given
      * - Returns the `notFoundValue` otherwise
      */
    def get[T](token: Type[T]): T = js.native
    def get[T](token: Type[T], notFoundValue: T): T = js.native
  }
  /* static members */
  object Injector {
    
    @JSImport("injection-js/injector", "Injector")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("injection-js/injector", "Injector.NULL")
    @js.native
    def NULL: Injector = js.native
    inline def NULL_=(x: Injector): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL")(x.asInstanceOf[js.Any])
    
    @JSImport("injection-js/injector", "Injector.THROW_IF_NOT_FOUND")
    @js.native
    def THROW_IF_NOT_FOUND: js.Object = js.native
    inline def THROW_IF_NOT_FOUND_=(x: js.Object): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THROW_IF_NOT_FOUND")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("injection-js/injector", "THROW_IF_NOT_FOUND")
  @js.native
  val THROW_IF_NOT_FOUND: js.Object = js.native
}
