package typings.jsonStringifySafe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(obj: Any): String = ^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(obj: Any, serializer: Null, indent: String): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, serializer: Null, indent: String, decycler: EntryProcessor): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], decycler.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, serializer: Null, indent: Double): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, serializer: Null, indent: Double, decycler: EntryProcessor): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], decycler.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, serializer: Null, indent: Null, decycler: EntryProcessor): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], decycler.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, serializer: Null, indent: Unit, decycler: EntryProcessor): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], decycler.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, serializer: Unit, indent: String): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, serializer: Unit, indent: String, decycler: EntryProcessor): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], decycler.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, serializer: Unit, indent: Double): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, serializer: Unit, indent: Double, decycler: EntryProcessor): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], decycler.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, serializer: Unit, indent: Null, decycler: EntryProcessor): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], decycler.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, serializer: Unit, indent: Unit, decycler: EntryProcessor): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], decycler.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, serializer: EntryProcessor): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, serializer: EntryProcessor, indent: String): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, serializer: EntryProcessor, indent: String, decycler: EntryProcessor): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], decycler.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, serializer: EntryProcessor, indent: Double): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, serializer: EntryProcessor, indent: Double, decycler: EntryProcessor): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], decycler.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, serializer: EntryProcessor, indent: Null, decycler: EntryProcessor): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], decycler.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def apply(obj: Any, serializer: EntryProcessor, indent: Unit, decycler: EntryProcessor): String = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], serializer.asInstanceOf[js.Any], indent.asInstanceOf[js.Any], decycler.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("json-stringify-safe", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getSerialize(): EntryProcessor = ^.asInstanceOf[js.Dynamic].applyDynamic("getSerialize")().asInstanceOf[EntryProcessor]
  inline def getSerialize(serializer: Null, decycler: EntryProcessor): EntryProcessor = (^.asInstanceOf[js.Dynamic].applyDynamic("getSerialize")(serializer.asInstanceOf[js.Any], decycler.asInstanceOf[js.Any])).asInstanceOf[EntryProcessor]
  inline def getSerialize(serializer: EntryProcessor): EntryProcessor = ^.asInstanceOf[js.Dynamic].applyDynamic("getSerialize")(serializer.asInstanceOf[js.Any]).asInstanceOf[EntryProcessor]
  inline def getSerialize(serializer: EntryProcessor, decycler: EntryProcessor): EntryProcessor = (^.asInstanceOf[js.Dynamic].applyDynamic("getSerialize")(serializer.asInstanceOf[js.Any], decycler.asInstanceOf[js.Any])).asInstanceOf[EntryProcessor]
  
  type EntryProcessor = js.Function2[/* key */ String, /* value */ Any, Any]
}
