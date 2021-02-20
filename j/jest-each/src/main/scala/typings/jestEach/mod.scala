package typings.jestEach

import typings.jestEach.anon.Describe
import typings.jestEach.bindMod.GlobalCallback
import typings.jestTypes.globalMod.EachTable
import typings.jestTypes.globalMod.EachTestFn
import typings.jestTypes.globalMod.TemplateData
import typings.jestTypes.globalMod.TestCallback
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("jest-each", JSImport.Default)
    @js.native
    def apply(
      table: EachTable,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param data because its type Global.TemplateData is not an array type */ data: TemplateData
    ): ReturnType[
        js.Function3[/* g */ Global, /* table */ EachTable, /* data */ TemplateData, Describe]
      ] = js.native
    
    @JSImport("jest-each", "default.withGlobal")
    @js.native
    def withGlobal(g: Global): js.Function2[/* table */ EachTable, /* data */ TemplateData, Describe] = js.native
  }
  
  @JSImport("jest-each", "bind")
  @js.native
  def bind[EachCallback /* <: TestCallback */](cb: GlobalCallback): js.Function2[
    /* table */ EachTable, 
    /* taggedTemplateData */ TemplateData, 
    js.Function3[
      /* title */ String, 
      /* test */ EachTestFn[EachCallback], 
      /* timeout */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  @JSImport("jest-each", "bind")
  @js.native
  def bind[EachCallback /* <: TestCallback */](cb: GlobalCallback, supportsDone: Boolean): js.Function2[
    /* table */ EachTable, 
    /* taggedTemplateData */ TemplateData, 
    js.Function3[
      /* title */ String, 
      /* test */ EachTestFn[EachCallback], 
      /* timeout */ js.UndefOr[Double], 
      Unit
    ]
  ] = js.native
  
  type Global = typings.jestTypes.globalMod.Global
}
