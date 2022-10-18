package typings.jridgewellGenMapping

import typings.jridgewellGenMapping.distTypesTypesMod.Mapping
import typings.jridgewellGenMapping.distTypesTypesMod.Pos
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Content extends StObject {
    
    var content: js.UndefOr[Null] = js.undefined
    
    var generated: Pos
    
    var name: js.UndefOr[Null] = js.undefined
    
    var original: js.UndefOr[Null] = js.undefined
    
    var source: js.UndefOr[Null] = js.undefined
  }
  object Content {
    
    inline def apply(generated: Pos): Content = {
      val __obj = js.Dynamic.literal(generated = generated.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setGenerated(value: Pos): Self = StObject.set(x, "generated", value.asInstanceOf[js.Any])
    }
  }
  
  trait Generated extends StObject {
    
    var content: js.UndefOr[String | Null] = js.undefined
    
    var generated: Pos
    
    var name: js.UndefOr[Null] = js.undefined
    
    var original: Pos
    
    var source: String
  }
  object Generated {
    
    inline def apply(generated: Pos, original: Pos, source: String): Generated = {
      val __obj = js.Dynamic.literal(generated = generated.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Generated]
    }
    
    extension [Self <: Generated](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setGenerated(value: Pos): Self = StObject.set(x, "generated", value.asInstanceOf[js.Any])
      
      inline def setOriginal(value: Pos): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait GeneratedName
    extends StObject
       with Mapping {
    
    var generated: Pos
    
    var name: Unit
    
    var original: Pos
    
    var source: String
  }
  object GeneratedName {
    
    inline def apply(generated: Pos, name: Unit, original: Pos, source: String): GeneratedName = {
      val __obj = js.Dynamic.literal(generated = generated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeneratedName]
    }
    
    extension [Self <: GeneratedName](x: Self) {
      
      inline def setGenerated(value: Pos): Self = StObject.set(x, "generated", value.asInstanceOf[js.Any])
      
      inline def setName(value: Unit): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOriginal(value: Pos): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var content: js.UndefOr[String | Null] = js.undefined
    
    var generated: Pos
    
    var name: String
    
    var original: Pos
    
    var source: String
  }
  object Name {
    
    inline def apply(generated: Pos, name: String, original: Pos, source: String): Name = {
      val __obj = js.Dynamic.literal(generated = generated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setGenerated(value: Pos): Self = StObject.set(x, "generated", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOriginal(value: Pos): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Original
    extends StObject
       with Mapping {
    
    var generated: Pos
    
    var name: Unit
    
    var original: Unit
    
    var source: Unit
  }
  object Original {
    
    inline def apply(generated: Pos, name: Unit, original: Unit, source: Unit): Original = {
      val __obj = js.Dynamic.literal(generated = generated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Original]
    }
    
    extension [Self <: Original](x: Self) {
      
      inline def setGenerated(value: Pos): Self = StObject.set(x, "generated", value.asInstanceOf[js.Any])
      
      inline def setName(value: Unit): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOriginal(value: Unit): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setSource(value: Unit): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait Source
    extends StObject
       with Mapping {
    
    var generated: Pos
    
    var name: String
    
    var original: Pos
    
    var source: String
  }
  object Source {
    
    inline def apply(generated: Pos, name: String, original: Pos, source: String): Source = {
      val __obj = js.Dynamic.literal(generated = generated.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[Source]
    }
    
    extension [Self <: Source](x: Self) {
      
      inline def setGenerated(value: Pos): Self = StObject.set(x, "generated", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOriginal(value: Pos): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
