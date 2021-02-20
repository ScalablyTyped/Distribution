package typings.jsonStringifySafe

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("json-stringify-safe", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any): String = js.native
  @JSImport("json-stringify-safe", JSImport.Namespace)
  @js.native
  def apply(
    obj: js.Any,
    serializer: js.UndefOr[scala.Nothing],
    indent: js.UndefOr[scala.Nothing],
    decycler: EntryProcessor
  ): String = js.native
  @JSImport("json-stringify-safe", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any, serializer: js.UndefOr[scala.Nothing], indent: String): String = js.native
  @JSImport("json-stringify-safe", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any, serializer: js.UndefOr[scala.Nothing], indent: String, decycler: EntryProcessor): String = js.native
  @JSImport("json-stringify-safe", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any, serializer: js.UndefOr[scala.Nothing], indent: Double): String = js.native
  @JSImport("json-stringify-safe", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any, serializer: js.UndefOr[scala.Nothing], indent: Double, decycler: EntryProcessor): String = js.native
  @JSImport("json-stringify-safe", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any, serializer: js.UndefOr[scala.Nothing], indent: Null, decycler: EntryProcessor): String = js.native
  @JSImport("json-stringify-safe", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any, serializer: Null, indent: js.UndefOr[scala.Nothing], decycler: EntryProcessor): String = js.native
  @JSImport("json-stringify-safe", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any, serializer: Null, indent: String): String = js.native
  @JSImport("json-stringify-safe", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any, serializer: Null, indent: String, decycler: EntryProcessor): String = js.native
  @JSImport("json-stringify-safe", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any, serializer: Null, indent: Double): String = js.native
  @JSImport("json-stringify-safe", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any, serializer: Null, indent: Double, decycler: EntryProcessor): String = js.native
  @JSImport("json-stringify-safe", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any, serializer: Null, indent: Null, decycler: EntryProcessor): String = js.native
  @JSImport("json-stringify-safe", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any, serializer: EntryProcessor): String = js.native
  @JSImport("json-stringify-safe", JSImport.Namespace)
  @js.native
  def apply(
    obj: js.Any,
    serializer: EntryProcessor,
    indent: js.UndefOr[scala.Nothing],
    decycler: EntryProcessor
  ): String = js.native
  @JSImport("json-stringify-safe", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any, serializer: EntryProcessor, indent: String): String = js.native
  @JSImport("json-stringify-safe", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any, serializer: EntryProcessor, indent: String, decycler: EntryProcessor): String = js.native
  @JSImport("json-stringify-safe", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any, serializer: EntryProcessor, indent: Double): String = js.native
  @JSImport("json-stringify-safe", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any, serializer: EntryProcessor, indent: Double, decycler: EntryProcessor): String = js.native
  @JSImport("json-stringify-safe", JSImport.Namespace)
  @js.native
  def apply(obj: js.Any, serializer: EntryProcessor, indent: Null, decycler: EntryProcessor): String = js.native
  
  @JSImport("json-stringify-safe", "getSerialize")
  @js.native
  def getSerialize(): EntryProcessor = js.native
  @JSImport("json-stringify-safe", "getSerialize")
  @js.native
  def getSerialize(serializer: Null, decycler: EntryProcessor): EntryProcessor = js.native
  @JSImport("json-stringify-safe", "getSerialize")
  @js.native
  def getSerialize(serializer: EntryProcessor): EntryProcessor = js.native
  @JSImport("json-stringify-safe", "getSerialize")
  @js.native
  def getSerialize(serializer: EntryProcessor, decycler: EntryProcessor): EntryProcessor = js.native
  
  type EntryProcessor = js.Function2[/* key */ String, /* value */ js.Any, js.Any]
}
