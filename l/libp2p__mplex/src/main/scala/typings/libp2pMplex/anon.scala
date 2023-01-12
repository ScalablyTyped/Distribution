package typings.libp2pMplex

import typings.itPushable.mod.PushableV_
import typings.libp2pMplex.distSrcMessageTypesMod.Message
import typings.libp2pMplex.distSrcMplexMod.MplexStream
import typings.libp2pMplex.libp2pMplexStrings.initiator
import typings.libp2pMplex.libp2pMplexStrings.receiver
import typings.std.IteratorResult
import typings.std.Map
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.AsyncGenerator<std.Uint8Array, void, undefined> & {push (value : @libp2p/mplex.@libp2p/mplex/dist/src/message-types.Message): it-pushable.it-pushable.PushableV<@libp2p/mplex.@libp2p/mplex/dist/src/message-types.Message>, end (err : std.Error | undefined): it-pushable.it-pushable.PushableV<@libp2p/mplex.@libp2p/mplex/dist/src/message-types.Message>, return (): {  done :boolean}} */
  @js.native
  trait AsyncGeneratorUint8Arrayv extends StObject {
    
    def end(): PushableV_[Message] = js.native
    def end(err: js.Error): PushableV_[Message] = js.native
    
    // NOTE: 'next' is defined using a tuple to ensure we report the correct assignability errors in all places.
    /* standard es2018.asyncgenerator */
    def next(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type [] | [TNext] is not an array type */ args: js.Array[Any | Unit]
    ): js.Promise[IteratorResult[js.typedarray.Uint8Array, Unit]] = js.native
    
    def push(value: Message): PushableV_[Message] = js.native
    
    def `return`(): Done = js.native
    /* standard es2018.asyncgenerator */
    def `return`(value: Unit): js.Promise[IteratorResult[js.typedarray.Uint8Array, Unit]] = js.native
    def `return`(value: PromiseLike[Unit]): js.Promise[IteratorResult[js.typedarray.Uint8Array, Unit]] = js.native
    /* standard es2018.asynciterable */
    @JSName("return")
    var return_FAsyncGeneratorUint8Arrayv: js.UndefOr[
        js.Function1[
          /* value */ js.UndefOr[Unit | PromiseLike[Unit]], 
          js.Promise[IteratorResult[js.typedarray.Uint8Array, Unit]]
        ]
      ] = js.native
    
    /* standard es2018.asynciterable */
    var `throw`: js.UndefOr[
        js.Function1[
          /* e */ js.UndefOr[Any], 
          js.Promise[IteratorResult[js.typedarray.Uint8Array, Unit]]
        ]
      ] = js.native
    /* standard es2018.asyncgenerator */
    def `throw`(e: Any): js.Promise[IteratorResult[js.typedarray.Uint8Array, Unit]] = js.native
  }
  
  trait Done extends StObject {
    
    var done: Boolean
  }
  object Done {
    
    inline def apply(done: Boolean): Done = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
      __obj.asInstanceOf[Done]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Done] (val x: Self) extends AnyVal {
      
      inline def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: Double
    
    var name: String
  }
  object Id {
    
    inline def apply(id: Double, name: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var id: Double
    
    var name: String
    
    var registry: Map[Double, MplexStream]
    
    var `type`: initiator | receiver
  }
  object Name {
    
    inline def apply(id: Double, name: String, registry: Map[Double, MplexStream], `type`: initiator | receiver): Name = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRegistry(value: Map[Double, MplexStream]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setType(value: initiator | receiver): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
