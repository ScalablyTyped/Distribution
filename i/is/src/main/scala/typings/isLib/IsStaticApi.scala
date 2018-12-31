package typings
package isLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsStaticApi extends js.Object {
  /**
    * Checks if the given value matches affirmative regexp.
    */
  def affirmative(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value matches affirmative regexp.
    */
  def affirmative(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value matches alpha numeric regexp.
    */
  def alphaNumeric(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value matches alpha numeric regexp.
    */
  def alphaNumeric(value: js.Array[_]): scala.Boolean = js.native
  //#region Type checks
  /**
    * Checks if the given value type is arguments.
    */
  def arguments(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value type is arguments.
    */
  def arguments(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value type is array.
    */
  def array(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value type is array.
    */
  def array(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value type is boolean.
    */
  def boolean(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value type is boolean.
    */
  def boolean(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value matches Canada postal code regexp.
    */
  def caPostalCode(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value matches Canada postal code regexp.
    */
  def caPostalCode(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given string is capitalized.
    */
  def capitalized(value: java.lang.String*): scala.Boolean = js.native
  /**
    * Checks if the given string is capitalized.
    */
  def capitalized(value: js.Array[java.lang.String]): scala.Boolean = js.native
  /**
    * Checks if the given value type is char.
    */
  def char(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value type is char.
    */
  def char(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value matches credit card regexp.
    */
  def creditCard(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value matches credit card regexp.
    */
  def creditCard(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value type is date.
    */
  def date(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value type is date.
    */
  def date(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value matches date string regexp.
    */
  def dateString(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value matches date string regexp.
    */
  def dateString(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value is decimal.
    */
  def decimal(value: scala.Double*): scala.Boolean = js.native
  /**
    * Checks if the given value is decimal.
    */
  def decimal(value: js.Array[scala.Double]): scala.Boolean = js.native
  /**
    * Checks if the given value type is defined.
    */
  def defined(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value type is defined.
    */
  def defined(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given object is a dom node.
    */
  def domNode(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given object is a dom node.
    */
  def domNode(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value matches email regexp.
    */
  def email(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value matches email regexp.
    */
  def email(value: js.Array[_]): scala.Boolean = js.native
  //#endregion
  //#region Presence checks
  /**
    * Checks if the given value is empty.
    */
  def empty(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value is empty.
    */
  def empty(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value matches extensible provisioning protocol phone regexp.
    */
  def eppPhone(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value matches extensible provisioning protocol phone regexp.
    */
  def eppPhone(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value type is error.
    */
  def error(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value type is error.
    */
  def error(value: js.Array[_]): scala.Boolean = js.native
  //#endregion
  //#region Arithmetic checks
  /**
    * Checks if the given value is even.
    */
  def even(value: scala.Double*): scala.Boolean = js.native
  /**
    * Checks if the given value is even.
    */
  def even(value: js.Array[scala.Double]): scala.Boolean = js.native
  /**
    * Checks if the given value is existy. (not null or undefined)
    */
  def existy(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value is existy. (not null or undefined)
    */
  def existy(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value is falsy.
    */
  def falsy(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value is falsy.
    */
  def falsy(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value is finite.
    */
  def finite(value: scala.Double*): scala.Boolean = js.native
  /**
    * Checks if the given value is finite.
    */
  def finite(value: js.Array[scala.Double]): scala.Boolean = js.native
  /**
    * Checks if the given value type is function.
    */
  def fn(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value type is function.
    */
  def fn(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value type is function.
    */
  def function(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value type is function.
    */
  def function(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given date object indicate future.
    */
  def future(value: stdLib.Date*): scala.Boolean = js.native
  /**
    * Checks if the given date object indicate future.
    */
  def future(value: js.Array[stdLib.Date]): scala.Boolean = js.native
  /**
    * Checks if the given value matches hexcolor regexp.
    */
  def hexColor(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value matches hexcolor regexp.
    */
  def hexColor(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value matches hexadecimal regexp.
    */
  def hexadecimal(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value matches hexadecimal regexp.
    */
  def hexadecimal(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value is infinite.
    */
  def infinite(value: scala.Double*): scala.Boolean = js.native
  /**
    * Checks if the given value is infinite.
    */
  def infinite(value: js.Array[scala.Double]): scala.Boolean = js.native
  /**
    * Checks if the given value is integer.
    */
  def integer(value: scala.Double*): scala.Boolean = js.native
  /**
    * Checks if the given value is integer.
    */
  def integer(value: js.Array[scala.Double]): scala.Boolean = js.native
  /**
    * Checks if the given value matches ip regexp.
    */
  def ip(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value matches ip regexp.
    */
  def ip(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value matches ipv4 regexp.
    */
  def ipv4(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value matches ipv4 regexp.
    */
  def ipv4(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value matches ipv6 regexp.
    */
  def ipv6(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value matches ipv6 regexp.
    */
  def ipv6(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value type is pure json object.
    */
  def json(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value type is pure json object.
    */
  def json(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given year number is a leap year
    */
  def leapYear(value: scala.Double*): scala.Boolean = js.native
  /**
    * Checks if the given year number is a leap year
    */
  def leapYear(value: js.Array[scala.Double]): scala.Boolean = js.native
  /**
    * Checks if the given string is lowercase.
    */
  def lowerCase(value: java.lang.String*): scala.Boolean = js.native
  /**
    * Checks if the given string is lowercase.
    */
  def lowerCase(value: js.Array[java.lang.String]): scala.Boolean = js.native
  /**
    * Checks if the given value type is NaN.
    */
  def nan(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value type is NaN.
    */
  def nan(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value matches North American numbering plan phone regexp.
    */
  def nanpPhone(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value matches North American numbering plan phone regexp.
    */
  def nanpPhone(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value is negative.
    */
  def negative(value: scala.Double*): scala.Boolean = js.native
  /**
    * Checks if the given value is negative.
    */
  def negative(value: js.Array[scala.Double]): scala.Boolean = js.native
  /**
    * Checks if the given value type is null.
    */
  def `null`(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value type is null.
    */
  def `null`(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value type is number.
    */
  def number(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value type is number.
    */
  def number(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value type is object.
    */
  def `object`(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value type is object.
    */
  def `object`(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value is odd.
    */
  def odd(value: scala.Double*): scala.Boolean = js.native
  /**
    * Checks if the given value is odd.
    */
  def odd(value: js.Array[scala.Double]): scala.Boolean = js.native
  /**
    * Checks if the given string is palindrome
    */
  def palindrome(value: java.lang.String*): scala.Boolean = js.native
  /**
    * Checks if the given string is palindrome
    */
  def palindrome(value: js.Array[java.lang.String]): scala.Boolean = js.native
  /**
    * Checks if the given date object indicate past.
    */
  def past(value: stdLib.Date*): scala.Boolean = js.native
  /**
    * Checks if the given date object indicate past.
    */
  def past(value: js.Array[stdLib.Date]): scala.Boolean = js.native
  /**
    * Checks if the given value is positive.
    */
  def positive(value: scala.Double*): scala.Boolean = js.native
  /**
    * Checks if the given value is positive.
    */
  def positive(value: js.Array[scala.Double]): scala.Boolean = js.native
  /**
    * Checks if the given value type is RegExp.
    */
  def regexp(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value type is RegExp.
    */
  def regexp(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value matches social security number regexp.
    */
  def socialSecurityNumber(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value matches social security number regexp.
    */
  def socialSecurityNumber(value: js.Array[_]): scala.Boolean = js.native
  //#endregion
  //#region Array checks
  /**
    * Checks if the given array is sorted.
    */
  def sorted(value: js.Array[scala.Double]*): scala.Boolean = js.native
  /**
    * Checks if the given array is sorted.
    */
  def sorted(value: js.Array[js.Array[scala.Double]]): scala.Boolean = js.native
  /**
    * Checks if the given value is space.
    */
  def space(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value is space.
    */
  def space(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value type is string.
    */
  def string(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value type is string.
    */
  def string(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value matches time string regexp.
    */
  def timeString(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value matches time string regexp.
    */
  def timeString(value: js.Array[_]): scala.Boolean = js.native
  //#endregion
  //#region Time checks
  /**
    * Checks if the given date object indicate today.
    */
  def today(value: stdLib.Date*): scala.Boolean = js.native
  /**
    * Checks if the given date object indicate today.
    */
  def today(value: js.Array[stdLib.Date]): scala.Boolean = js.native
  /**
    * Checks if the given date object indicate tomorrow.
    */
  def tomorrow(value: stdLib.Date*): scala.Boolean = js.native
  /**
    * Checks if the given date object indicate tomorrow.
    */
  def tomorrow(value: js.Array[stdLib.Date]): scala.Boolean = js.native
  /**
    * Checks if the given value is truthy. (existy and not false)
    */
  def truthy(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value is truthy. (existy and not false)
    */
  def truthy(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value matches UK post code regexp.
    */
  def ukPostCode(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value matches UK post code regexp.
    */
  def ukPostCode(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value type is undefined.
    */
  def undefined(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value type is undefined.
    */
  def undefined(value: js.Array[_]): scala.Boolean = js.native
  //#endregion
  //#region String checks
  /**
    * Checks if the given string is UPPERCASE.
    */
  def upperCase(value: java.lang.String*): scala.Boolean = js.native
  /**
    * Checks if the given string is UPPERCASE.
    */
  def upperCase(value: js.Array[java.lang.String]): scala.Boolean = js.native
  //#endregion
  //#region RegExp checks
  /**
    * Checks if the given value matches url regexp.
    */
  def url(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value matches url regexp.
    */
  def url(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given value matches US zip code regexp.
    */
  def usZipCode(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given value matches US zip code regexp.
    */
  def usZipCode(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given date objects' day is weekday.
    */
  def weekday(value: stdLib.Date*): scala.Boolean = js.native
  /**
    * Checks if the given date objects' day is weekday.
    */
  def weekday(value: js.Array[stdLib.Date]): scala.Boolean = js.native
  /**
    * Checks if the given date objects' day is weekend.
    */
  def weekend(value: stdLib.Date*): scala.Boolean = js.native
  /**
    * Checks if the given date objects' day is weekend.
    */
  def weekend(value: js.Array[stdLib.Date]): scala.Boolean = js.native
  //#endregion
  //#region Object checks
  /**
    * Checks if the given object is window object.
    */
  def windowObject(value: js.Any*): scala.Boolean = js.native
  /**
    * Checks if the given object is window object.
    */
  def windowObject(value: js.Array[_]): scala.Boolean = js.native
  /**
    * Checks if the given date object indicate yesterday.
    */
  def yesterday(value: stdLib.Date*): scala.Boolean = js.native
  /**
    * Checks if the given date object indicate yesterday.
    */
  def yesterday(value: js.Array[stdLib.Date]): scala.Boolean = js.native
}

