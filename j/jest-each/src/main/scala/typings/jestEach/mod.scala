package typings.jestEach

import typings.jestEach.bindMod.GlobalCallback
import typings.jestTypes.globalMod.EachTable
import typings.jestTypes.globalMod.EachTestFn
import typings.jestTypes.globalMod.TemplateData
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
    ): AnonDescribe = js.native
    def withGlobal(g: typings.jestTypes.globalMod.Global): js.Function2[/* table */ EachTable, /* data */ TemplateData, AnonDescribe] = js.native
  }
  
  type Global = typings.jestTypes.globalMod.Global
}

