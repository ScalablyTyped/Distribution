package typings.losslessJson

import typings.losslessJson.anon.CircularRefs
import typings.losslessJson.anon.CircularRefsBoolean
import typings.losslessJson.losslessJsonBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("lossless-json", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("lossless-json", "LosslessNumber")
  @js.native
  class LosslessNumber protected () extends StObject {
    def this(value: String) = this()
    def this(value: Double) = this()
    
    var isLosslessNumber: `true` = js.native
    
    var `type`: typings.losslessJson.losslessJsonStrings.LosslessNumber = js.native
    
    // value as string
    var value: String = js.native
  }
  
  @scala.inline
  def config(): CircularRefsBoolean = ^.asInstanceOf[js.Dynamic].applyDynamic("config")().asInstanceOf[CircularRefsBoolean]
  @scala.inline
  def config(hasCircularRefs: CircularRefs): CircularRefsBoolean = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(hasCircularRefs.asInstanceOf[js.Any]).asInstanceOf[CircularRefsBoolean]
  
  @scala.inline
  def parse(text: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def parse(text: String, reviver: js.Function2[/* key */ String, /* value */ js.Any, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(text.asInstanceOf[js.Any], reviver.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def stringify(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def stringify(value: js.Any, replacer: js.Array[String | Double]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(value: js.Any, replacer: js.Array[String | Double], space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(value: js.Any, replacer: js.Array[String | Double], space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any], space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(value: js.Any, replacer: js.Function2[/* key */ String, /* value */ js.Any, js.Any], space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(value: js.Any, replacer: Unit, space: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def stringify(value: js.Any, replacer: Unit, space: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(value.asInstanceOf[js.Any], replacer.asInstanceOf[js.Any], space.asInstanceOf[js.Any])).asInstanceOf[String]
}
