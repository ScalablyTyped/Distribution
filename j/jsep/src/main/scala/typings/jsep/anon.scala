package typings.jsep

import typings.jsep.mod.Expression
import typings.jsep.mod.HookCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Context extends StObject {
    
    var context: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof jsep */ Any
      ] = js.undefined
    
    var node: js.UndefOr[Expression] = js.undefined
  }
  object Context {
    
    inline def apply(): Context = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setContext(value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof jsep */ Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setNode(value: Expression): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    }
  }
  
  trait Node extends StObject {
    
    var node: js.UndefOr[Expression] = js.undefined
  }
  object Node {
    
    inline def apply(): Node = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      inline def setNode(value: Expression): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    }
  }
  
  /* Inlined {[ name in jsep.jsep.HookType ]: jsep.jsep.HookCallback} */
  trait nameinHookTypeHookCallbac extends StObject {
    
    def `after-expression`(env: Node): Unit
    @JSName("after-expression")
    var `after-expression_Original`: HookCallback
    
    def `after-token`(env: Node): Unit
    @JSName("after-token")
    var `after-token_Original`: HookCallback
    
    def `gobble-expression`(env: Node): Unit
    @JSName("gobble-expression")
    var `gobble-expression_Original`: HookCallback
    
    def `gobble-spaces`(env: Node): Unit
    @JSName("gobble-spaces")
    var `gobble-spaces_Original`: HookCallback
    
    def `gobble-token`(env: Node): Unit
    @JSName("gobble-token")
    var `gobble-token_Original`: HookCallback
  }
  object nameinHookTypeHookCallbac {
    
    inline def apply(
      `after-expression`: HookCallback,
      `after-token`: HookCallback,
      `gobble-expression`: HookCallback,
      `gobble-spaces`: HookCallback,
      `gobble-token`: HookCallback
    ): nameinHookTypeHookCallbac = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("after-expression")(`after-expression`.asInstanceOf[js.Any])
      __obj.updateDynamic("after-token")(`after-token`.asInstanceOf[js.Any])
      __obj.updateDynamic("gobble-expression")(`gobble-expression`.asInstanceOf[js.Any])
      __obj.updateDynamic("gobble-spaces")(`gobble-spaces`.asInstanceOf[js.Any])
      __obj.updateDynamic("gobble-token")(`gobble-token`.asInstanceOf[js.Any])
      __obj.asInstanceOf[nameinHookTypeHookCallbac]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: nameinHookTypeHookCallbac] (val x: Self) extends AnyVal {
      
      inline def `setAfter-expression`(value: HookCallback): Self = StObject.set(x, "after-expression", value.asInstanceOf[js.Any])
      
      inline def `setAfter-token`(value: HookCallback): Self = StObject.set(x, "after-token", value.asInstanceOf[js.Any])
      
      inline def `setGobble-expression`(value: HookCallback): Self = StObject.set(x, "gobble-expression", value.asInstanceOf[js.Any])
      
      inline def `setGobble-spaces`(value: HookCallback): Self = StObject.set(x, "gobble-spaces", value.asInstanceOf[js.Any])
      
      inline def `setGobble-token`(value: HookCallback): Self = StObject.set(x, "gobble-token", value.asInstanceOf[js.Any])
    }
  }
}
