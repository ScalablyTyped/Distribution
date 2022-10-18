package typings.intlifyCoreBase

import typings.intlifyCoreBase.mod.CoreMissingType
import typings.intlifyCoreBase.mod.CurrencyDisplay
import typings.intlifyCoreBase.mod.DateTimeDigital
import typings.intlifyCoreBase.mod.DateTimeHumanReadable
import typings.intlifyCoreBase.mod.FormatMatcher
import typings.intlifyCoreBase.mod.FormattedNumberPartType
import typings.intlifyCoreBase.mod.LocaleMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object intlifyCoreBaseStrings {
  
  @js.native
  sealed trait `2-digit`
    extends StObject
       with DateTimeDigital
  inline def `2-digit`: `2-digit` = "2-digit".asInstanceOf[`2-digit`]
  
  @js.native
  sealed trait basic
    extends StObject
       with FormatMatcher
  inline def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait `best fit`
    extends StObject
       with FormatMatcher
       with LocaleMatcher
  inline def `best fit`: `best fit` = ("best fit").asInstanceOf[`best fit`]
  
  @js.native
  sealed trait code
    extends StObject
       with CurrencyDisplay
  inline def code: code = "code".asInstanceOf[code]
  
  @js.native
  sealed trait currency
    extends StObject
       with FormattedNumberPartType
  inline def currency: currency = "currency".asInstanceOf[currency]
  
  @js.native
  sealed trait `datetime format`
    extends StObject
       with CoreMissingType
  inline def `datetime format`: `datetime format` = ("datetime format").asInstanceOf[`datetime format`]
  
  @js.native
  sealed trait decimal
    extends StObject
       with FormattedNumberPartType
  inline def decimal: decimal = "decimal".asInstanceOf[decimal]
  
  @js.native
  sealed trait `en-US` extends StObject
  inline def `en-US`: `en-US` = "en-US".asInstanceOf[`en-US`]
  
  @js.native
  sealed trait fraction
    extends StObject
       with FormattedNumberPartType
  inline def fraction: fraction = "fraction".asInstanceOf[fraction]
  
  @js.native
  sealed trait group
    extends StObject
       with FormattedNumberPartType
  inline def group: group = "group".asInstanceOf[group]
  
  @js.native
  sealed trait infinity
    extends StObject
       with FormattedNumberPartType
  inline def infinity: infinity = "infinity".asInstanceOf[infinity]
  
  @js.native
  sealed trait integer
    extends StObject
       with FormattedNumberPartType
  inline def integer: integer = "integer".asInstanceOf[integer]
  
  @js.native
  sealed trait literal
    extends StObject
       with FormattedNumberPartType
  inline def literal: literal = "literal".asInstanceOf[literal]
  
  @js.native
  sealed trait long
    extends StObject
       with DateTimeHumanReadable
  inline def long: long = "long".asInstanceOf[long]
  
  @js.native
  sealed trait lookup
    extends StObject
       with LocaleMatcher
  inline def lookup: lookup = "lookup".asInstanceOf[lookup]
  
  @js.native
  sealed trait minusSign
    extends StObject
       with FormattedNumberPartType
  inline def minusSign: minusSign = "minusSign".asInstanceOf[minusSign]
  
  @js.native
  sealed trait name
    extends StObject
       with CurrencyDisplay
  inline def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait nan
    extends StObject
       with FormattedNumberPartType
  inline def nan: nan = "nan".asInstanceOf[nan]
  
  @js.native
  sealed trait narrow
    extends StObject
       with DateTimeHumanReadable
  inline def narrow: narrow = "narrow".asInstanceOf[narrow]
  
  @js.native
  sealed trait `number format`
    extends StObject
       with CoreMissingType
  inline def `number format`: `number format` = ("number format").asInstanceOf[`number format`]
  
  @js.native
  sealed trait numeric
    extends StObject
       with DateTimeDigital
  inline def numeric: numeric = "numeric".asInstanceOf[numeric]
  
  @js.native
  sealed trait percent extends StObject
  inline def percent: percent = "percent".asInstanceOf[percent]
  
  @js.native
  sealed trait percentSign
    extends StObject
       with FormattedNumberPartType
  inline def percentSign: percentSign = "percentSign".asInstanceOf[percentSign]
  
  @js.native
  sealed trait plusSign
    extends StObject
       with FormattedNumberPartType
  inline def plusSign: plusSign = "plusSign".asInstanceOf[plusSign]
  
  @js.native
  sealed trait short
    extends StObject
       with DateTimeHumanReadable
  inline def short: short = "short".asInstanceOf[short]
  
  @js.native
  sealed trait symbol
    extends StObject
       with CurrencyDisplay
  inline def symbol: symbol = "symbol".asInstanceOf[symbol]
  
  @js.native
  sealed trait toString extends StObject
  
  @js.native
  sealed trait translate
    extends StObject
       with CoreMissingType
  inline def translate: translate = "translate".asInstanceOf[translate]
}
