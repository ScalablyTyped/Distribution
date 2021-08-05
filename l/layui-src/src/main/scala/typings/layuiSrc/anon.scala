package typings.layuiSrc

import typings.layuiSrc.layui.DateOption
import typings.layuiSrc.layuiSrcStrings.`null`
import typings.layuiSrc.layuiSrcStrings.asc
import typings.layuiSrc.layuiSrcStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Config extends StObject {
    
    var config: DateOption
    
    def hint(): Unit
  }
  object Config {
    
    inline def apply(config: DateOption, hint: () => Unit): Config = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], hint = js.Any.fromFunction0(hint))
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setConfig(value: DateOption): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setHint(value: () => Unit): Self = StObject.set(x, "hint", js.Any.fromFunction0(value))
    }
  }
  
  trait Content extends StObject {
    
    var content: String
    
    var title: String
  }
  object Content {
    
    inline def apply(content: String, title: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    extension [Self <: Content](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait Data extends StObject {
    
    var data: js.Array[js.Any]
    
    var isAll: Boolean
  }
  object Data {
    
    inline def apply(data: js.Array[js.Any], isAll: Boolean): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isAll = isAll.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      inline def setIsAll(value: Boolean): Self = StObject.set(x, "isAll", value.asInstanceOf[js.Any])
    }
  }
  
  trait Experience extends StObject {
    
    var experience: String
    
    var score: Double | String
  }
  object Experience {
    
    inline def apply(experience: String, score: Double | String): Experience = {
      val __obj = js.Dynamic.literal(experience = experience.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[Experience]
    }
    
    extension [Self <: Experience](x: Self) {
      
      inline def setExperience(value: String): Self = StObject.set(x, "experience", value.asInstanceOf[js.Any])
      
      inline def setScore(value: Double | String): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  trait Field extends StObject {
    
    var field: String
    
    var `type`: js.UndefOr[`null` | desc | asc] = js.undefined
  }
  object Field {
    
    inline def apply(field: String): Field = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[Field]
    }
    
    extension [Self <: Field](x: Self) {
      
      inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setType(value: `null` | desc | asc): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Icon extends StObject {
    
    var icon: String
    
    var layEvent: String
    
    var title: String
  }
  object Icon {
    
    inline def apply(icon: String, layEvent: String, title: String): Icon = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], layEvent = layEvent.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Icon]
    }
    
    extension [Self <: Icon](x: Self) {
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setLayEvent(value: String): Self = StObject.set(x, "layEvent", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait None extends StObject {
    
    var none: String
  }
  object None {
    
    inline def apply(none: String): None = {
      val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any])
      __obj.asInstanceOf[None]
    }
    
    extension [Self <: None](x: Self) {
      
      inline def setNone(value: String): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    var `type`: String
    
    var url: String
  }
  object Type {
    
    inline def apply(`type`: String, url: String): Type = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
