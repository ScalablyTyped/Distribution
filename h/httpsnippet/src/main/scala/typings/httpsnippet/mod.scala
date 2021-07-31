package typings.httpsnippet

import typings.harFormat.mod.Har
import typings.harFormat.mod.Request
import typings.httpsnippet.anon.Info
import typings.httpsnippet.httpsnippetBooleans.`false`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /*~ Write your module's methods and properties in this class */
  @JSImport("httpsnippet", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with HTTPSnippet {
    def this(data: Data) = this()
  }
  @JSImport("httpsnippet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def addTarget(target: Target[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addTarget")(target.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def addTargetClient(target: String, client: TargetClient): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addTargetClient")(target.asInstanceOf[js.Any], client.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  @JSImport("httpsnippet", "availableTargets")
  @js.native
  def availableTargets: js.Array[String] = js.native
  @scala.inline
  def availableTargets_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("availableTargets")(x.asInstanceOf[js.Any])
  
  /* static member */
  @scala.inline
  def extName(target: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extName")(target.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type Data = Har | Request
  
  /*~ Write your module's methods and properties in this class */
  @js.native
  trait HTTPSnippet extends StObject {
    
    def convert(target: String): String | `false` = js.native
    def convert(target: String, client: String): String | `false` = js.native
    def convert(target: String, client: String, options: Options): String | `false` = js.native
    def convert(target: String, client: Unit, options: Options): String | `false` = js.native
    def convert(target: String, options: Options): String | `false` = js.native
  }
  
  type Options = js.Object
  
  type Target[C /* <: String */] = Info[C] & (Record[C, TargetClient])
  
  @js.native
  trait TargetClient extends StObject {
    
    def apply(source: Request, options: Options): String = js.native
    
    var info: TargetClientInfo = js.native
  }
  
  trait TargetClientInfo extends StObject {
    
    var description: js.UndefOr[String] = js.undefined
    
    var key: String
    
    var link: js.UndefOr[String] = js.undefined
    
    var title: String
  }
  object TargetClientInfo {
    
    @scala.inline
    def apply(key: String, title: String): TargetClientInfo = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetClientInfo]
    }
    
    @scala.inline
    implicit class TargetClientInfoMutableBuilder[Self <: TargetClientInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait TargetInfo[C /* <: String */] extends StObject {
    
    var default: C
    
    var extname: String
    
    var key: String
    
    var title: String
  }
  object TargetInfo {
    
    @scala.inline
    def apply[C /* <: String */](default: C, extname: String, key: String, title: String): TargetInfo[C] = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], extname = extname.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetInfo[C]]
    }
    
    @scala.inline
    implicit class TargetInfoMutableBuilder[Self <: TargetInfo[?], C /* <: String */] (val x: Self & TargetInfo[C]) extends AnyVal {
      
      @scala.inline
      def setDefault(value: C): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtname(value: String): Self = StObject.set(x, "extname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
}
