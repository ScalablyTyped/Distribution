package typings.jestDashEach

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-each/build/table/template", JSImport.Namespace)
@js.native
object buildTableTemplateMod extends js.Object {
  def default(title: String, headings: js.Array[String], row: js.Array[_]): js.Array[Anon_Arguments] = js.native
  def getPath[Obj /* <: Template */](obj: Obj, path: js.Array[String]): js.Any = js.native
  def getPath[Obj /* <: Template */, A /* <: String */, B /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof Obj[A] */ js.Any */](obj: Obj, path: js.Tuple2[A, B]): /* import warning: importer.ImportType#apply Failed type conversion: Obj[A][B] */ js.Any = js.native
  def getPath[Obj /* <: Template */, A /* <: String */, B /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof Obj[A] */ js.Any */, C /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof Obj[A][B] */ js.Any */](obj: Obj, path: js.Tuple3[A, B, C]): /* import warning: importer.ImportType#apply Failed type conversion: Obj[A][B][C] */ js.Any = js.native
  def getPath[Obj /* <: Template */, A /* <: String */, B /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof Obj[A] */ js.Any */, C /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof Obj[A][B] */ js.Any */, D /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof Obj[A][B][C] */ js.Any */](obj: Obj, path: js.Tuple4[A, B, C, D]): /* import warning: importer.ImportType#apply Failed type conversion: Obj[A][B][C][D] */ js.Any = js.native
  def getPath[Obj /* <: Template */, A /* <: String */, B /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof Obj[A] */ js.Any */, C /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof Obj[A][B] */ js.Any */, D /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof Obj[A][B][C] */ js.Any */, E /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof Obj[A][B][C][D] */ js.Any */](obj: Obj, path: js.Tuple5[A, B, C, D, E]): /* import warning: importer.ImportType#apply Failed type conversion: Obj[A][B][C][D][E] */ js.Any = js.native
  @JSName("getPath")
  def getPath_Obj_TemplateA_String[Obj /* <: Template */, A /* <: String */](obj: Obj, path: js.Array[A]): /* import warning: importer.ImportType#apply Failed type conversion: Obj[A] */ js.Any = js.native
  type Template = Record[String, js.Any]
}

