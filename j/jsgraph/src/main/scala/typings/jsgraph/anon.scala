package typings.jsgraph

import typings.jsgraph.mod.DirectedGraph
import typings.jsgraph.mod.Edge
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dirgaph extends StObject {
    
    var dirgaph: DirectedGraph
  }
  object Dirgaph {
    
    @scala.inline
    def apply(dirgaph: DirectedGraph): Dirgaph = {
      val __obj = js.Dynamic.literal(dirgaph = dirgaph.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dirgaph]
    }
    
    @scala.inline
    implicit class DirgaphMutableBuilder[Self <: Dirgaph] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirgaph(value: DirectedGraph): Self = StObject.set(x, "dirgaph", value.asInstanceOf[js.Any])
    }
  }
  
  trait E extends StObject {
    
    var e: Edge
    
    var g: DirectedGraph
  }
  object E {
    
    @scala.inline
    def apply(e: Edge, g: DirectedGraph): E = {
      val __obj = js.Dynamic.literal(e = e.asInstanceOf[js.Any], g = g.asInstanceOf[js.Any])
      __obj.asInstanceOf[E]
    }
    
    @scala.inline
    implicit class EMutableBuilder[Self <: E] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setE(value: Edge): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setG(value: DirectedGraph): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error extends StObject {
    
    var error: js.UndefOr[js.Any] = js.undefined
    
    var result: js.UndefOr[DirectedGraph] = js.undefined
  }
  object Error {
    
    @scala.inline
    def apply(): Error = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit class ErrorMutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      @scala.inline
      def setResult(value: DirectedGraph): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
  
  trait G extends StObject {
    
    var g: DirectedGraph
    
    var u: String
  }
  object G {
    
    @scala.inline
    def apply(g: DirectedGraph, u: String): G = {
      val __obj = js.Dynamic.literal(g = g.asInstanceOf[js.Any], u = u.asInstanceOf[js.Any])
      __obj.asInstanceOf[G]
    }
    
    @scala.inline
    implicit class GMutableBuilder[Self <: G] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setG(value: DirectedGraph): Self = StObject.set(x, "g", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setU(value: String): Self = StObject.set(x, "u", value.asInstanceOf[js.Any])
    }
  }
  
  trait Result extends StObject {
    
    var result: DirectedGraph
  }
  object Result {
    
    @scala.inline
    def apply(result: DirectedGraph): Result = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit class ResultMutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResult(value: DirectedGraph): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
}
