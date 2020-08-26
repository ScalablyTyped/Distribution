package typings.jestEach

import typings.jestEach.anon.Describe
import typings.jestEach.bindMod.GlobalCallback
import typings.jestTypes.globalMod.EachTable
import typings.jestTypes.globalMod.EachTestFn
import typings.jestTypes.globalMod.TemplateData
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-each", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def bind(cb: GlobalCallback): js.Function2[
    /* table */ EachTable, 
    /* taggedTemplateData */ TemplateData, 
    js.Function3[/* title */ String, /* test */ EachTestFn, /* timeout */ js.UndefOr[Double], Unit]
  ] = js.native
  def bind(cb: GlobalCallback, supportsDone: Boolean): js.Function2[
    /* table */ EachTable, 
    /* taggedTemplateData */ TemplateData, 
    js.Function3[/* title */ String, /* test */ EachTestFn, /* timeout */ js.UndefOr[Double], Unit]
  ] = js.native
  @js.native
  object default extends js.Object {
    def apply(
      table: EachTable,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param data because its type Global.TemplateData is not an array type */ data: TemplateData
    ): ReturnType[
        js.Function3[/* g */ Global, /* table */ EachTable, /* data */ TemplateData, Describe]
      ] = js.native
    def withGlobal(g: Global): js.Function2[/* table */ EachTable, /* data */ TemplateData, Describe] = js.native
  }
  
  type Global = typings.jestTypes.globalMod.Global
}

