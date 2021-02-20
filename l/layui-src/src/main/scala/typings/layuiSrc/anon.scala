package typings.layuiSrc

import typings.layuiSrc.layui.DateOption
import typings.layuiSrc.layuiSrcStrings.`null`
import typings.layuiSrc.layuiSrcStrings.asc
import typings.layuiSrc.layuiSrcStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Config extends StObject {
    
    var config: DateOption = js.native
    
    def hint(): Unit = js.native
  }
  object Config {
    
    @scala.inline
    def apply(config: DateOption, hint: () => Unit): Config = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], hint = js.Any.fromFunction0(hint))
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfig(value: DateOption): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHint(value: () => Unit): Self = StObject.set(x, "hint", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Content extends StObject {
    
    var content: String = js.native
    
    var title: String = js.native
  }
  object Content {
    
    @scala.inline
    def apply(content: String, title: String): Content = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content]
    }
    
    @scala.inline
    implicit class ContentMutableBuilder[Self <: Content] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Data extends StObject {
    
    var data: js.Array[js.Any] = js.native
    
    var isAll: Boolean = js.native
  }
  object Data {
    
    @scala.inline
    def apply(data: js.Array[js.Any], isAll: Boolean): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], isAll = isAll.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setIsAll(value: Boolean): Self = StObject.set(x, "isAll", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Experience extends StObject {
    
    var experience: String = js.native
    
    var score: Double | String = js.native
  }
  object Experience {
    
    @scala.inline
    def apply(experience: String, score: Double | String): Experience = {
      val __obj = js.Dynamic.literal(experience = experience.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
      __obj.asInstanceOf[Experience]
    }
    
    @scala.inline
    implicit class ExperienceMutableBuilder[Self <: Experience] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExperience(value: String): Self = StObject.set(x, "experience", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScore(value: Double | String): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Field extends StObject {
    
    var field: String = js.native
    
    var `type`: js.UndefOr[`null` | desc | asc] = js.native
  }
  object Field {
    
    @scala.inline
    def apply(field: String): Field = {
      val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
      __obj.asInstanceOf[Field]
    }
    
    @scala.inline
    implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: `null` | desc | asc): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Icon extends StObject {
    
    var icon: String = js.native
    
    var layEvent: String = js.native
    
    var title: String = js.native
  }
  object Icon {
    
    @scala.inline
    def apply(icon: String, layEvent: String, title: String): Icon = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], layEvent = layEvent.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[Icon]
    }
    
    @scala.inline
    implicit class IconMutableBuilder[Self <: Icon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayEvent(value: String): Self = StObject.set(x, "layEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait None extends StObject {
    
    var none: String = js.native
  }
  object None {
    
    @scala.inline
    def apply(none: String): None = {
      val __obj = js.Dynamic.literal(none = none.asInstanceOf[js.Any])
      __obj.asInstanceOf[None]
    }
    
    @scala.inline
    implicit class NoneMutableBuilder[Self <: None] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNone(value: String): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var `type`: String = js.native
    
    var url: String = js.native
  }
  object Type {
    
    @scala.inline
    def apply(`type`: String, url: String): Type = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
