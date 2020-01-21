package typings.jss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Classes[Name /* <: java.lang.String | scala.Double | js.Symbol */] = typings.std.Record[Name, java.lang.String]
  type CreateGenerateId_ = js.Function1[
    /* options */ js.UndefOr[typings.jss.mod.CreateGenerateIdOptions], 
    typings.jss.mod.GenerateId
  ]
  type CssProperties = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof jss.jss.NormalCssProperties ]: jss.jss.FnValue<jss.jss.NormalCssProperties[K]>}
    */ typings.jss.jssStrings.CssProperties with typings.jss.mod.NormalCssProperties
  // TODO: Type data better, currently typed as any for allowing to override it
  type FnValue[R] = R | (js.Function1[/* data */ js.Any, R])
  type GenerateId = js.Function2[
    /* rule */ typings.jss.mod.Rule, 
    /* sheet */ js.UndefOr[typings.jss.mod.StyleSheet[java.lang.String]], 
    java.lang.String
  ]
  type InsertionPoint = java.lang.String | typings.std.HTMLElement
  type JssStyle = typings.jss.mod.JssStyleP[
    typings.jss.mod.JssStyleP[
      typings.jss.mod.JssStyleP[
        typings.jss.mod.JssStyleP[
          typings.jss.mod.JssStyleP[typings.jss.mod.JssStyleP[typings.jss.mod.JssStyleP[scala.Unit]]]
        ]
      ]
    ]
  ]
  // Jss Style definitions
  type JssStyleP[S] = typings.jss.mod.CssProperties with (org.scalablytyped.runtime.StringDictionary[typings.jss.mod.FnValue[typings.jss.mod.JssValue | S]])
  type JssValue = java.lang.String | scala.Double | (js.Array[
    java.lang.String | scala.Double | (js.Array[java.lang.String | scala.Double]) | typings.jss.jssStrings.Exclamationmarkimportant
  ]) | scala.Null | typings.jss.jssBooleans.`false`
  type Keyframes[Name /* <: java.lang.String */] = typings.std.Record[Name, java.lang.String]
  type NormalCssProperties = typings.csstype.mod.Properties[java.lang.String | scala.Double]
  type Styles[Name /* <: java.lang.String | scala.Double | js.Symbol */] = typings.std.Record[Name, typings.jss.mod.JssStyle | java.lang.String]
}
