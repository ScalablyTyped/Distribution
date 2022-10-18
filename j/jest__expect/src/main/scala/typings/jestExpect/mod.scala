package typings.jestExpect

import typings.expect.mod.AsymmetricMatchers
import typings.expect.mod.BaseExpect
import typings.expect.mod.Matchers
import typings.jestExpect.anon.OmitAsymmetricMatchersany
import typings.jestSnapshot.mod.SnapshotMatchers
import typings.prettyFormat.mod.Plugin2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@jest/expect", "jestExpect")
  @js.native
  val jestExpect: JestExpect_ = js.native
  
  trait Inverse[Matchers] extends StObject {
    
    /**
      * Inverse next matcher. If you know how to test something, `.not` lets you test its opposite.
      */
    var not: Matchers
  }
  object Inverse {
    
    inline def apply[Matchers](not: Matchers): Inverse[Matchers] = {
      val __obj = js.Dynamic.literal(not = not.asInstanceOf[js.Any])
      __obj.asInstanceOf[Inverse[Matchers]]
    }
    
    extension [Self <: Inverse[?], Matchers](x: Self & Inverse[Matchers]) {
      
      inline def setNot(value: Matchers): Self = StObject.set(x, "not", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JestExpect_
    extends StObject
       with BaseExpect
       with AsymmetricMatchers
       with Inverse[OmitAsymmetricMatchersany] {
    
    def apply[T](actual: T): (JestMatchers[Unit, T]) & (Inverse[JestMatchers[Unit, T]]) & PromiseMatchers[T] = js.native
    
    def addSnapshotSerializer(plugin: Plugin2): Unit = js.native
    @JSName("addSnapshotSerializer")
    var addSnapshotSerializer_Original: js.Function1[/* plugin */ Plugin2, Unit] = js.native
  }
  
  @js.native
  trait JestMatchers[R /* <: Unit | js.Promise[Unit] */, T]
    extends StObject
       with Matchers[R]
       with SnapshotMatchers[R, T]
  
  trait PromiseMatchers[T] extends StObject {
    
    /**
      * Unwraps the reason of a rejected promise so any other matcher can be chained.
      * If the promise is fulfilled the assertion fails.
      */
    var rejects: (JestMatchers[js.Promise[Unit], T]) & (Inverse[JestMatchers[js.Promise[Unit], T]])
    
    /**
      * Unwraps the value of a fulfilled promise so any other matcher can be chained.
      * If the promise is rejected the assertion fails.
      */
    var resolves: (JestMatchers[js.Promise[Unit], T]) & (Inverse[JestMatchers[js.Promise[Unit], T]])
  }
  object PromiseMatchers {
    
    inline def apply[T](
      rejects: (JestMatchers[js.Promise[Unit], T]) & (Inverse[JestMatchers[js.Promise[Unit], T]]),
      resolves: (JestMatchers[js.Promise[Unit], T]) & (Inverse[JestMatchers[js.Promise[Unit], T]])
    ): PromiseMatchers[T] = {
      val __obj = js.Dynamic.literal(rejects = rejects.asInstanceOf[js.Any], resolves = resolves.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromiseMatchers[T]]
    }
    
    extension [Self <: PromiseMatchers[?], T](x: Self & PromiseMatchers[T]) {
      
      inline def setRejects(value: (JestMatchers[js.Promise[Unit], T]) & (Inverse[JestMatchers[js.Promise[Unit], T]])): Self = StObject.set(x, "rejects", value.asInstanceOf[js.Any])
      
      inline def setResolves(value: (JestMatchers[js.Promise[Unit], T]) & (Inverse[JestMatchers[js.Promise[Unit], T]])): Self = StObject.set(x, "resolves", value.asInstanceOf[js.Any])
    }
  }
}
