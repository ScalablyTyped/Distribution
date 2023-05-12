package typings.json2csvTransforms

import typings.json2csvTransforms.srcFlattenMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@json2csv/transforms", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flatten(): js.Function1[/* dataRow */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")().asInstanceOf[js.Function1[/* dataRow */ Any, Any]]
  inline def flatten(opts: Options): js.Function1[/* dataRow */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatten")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* dataRow */ Any, Any]]
  
  inline def unwind(): js.Function1[/* dataRow */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwind")().asInstanceOf[js.Function1[/* dataRow */ Any, Any]]
  inline def unwind(opts: typings.json2csvTransforms.srcUnwindMod.Options): js.Function1[/* dataRow */ Any, Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("unwind")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* dataRow */ Any, Any]]
}
