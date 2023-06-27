package typings.is

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsStatic extends StObject {
  
  /**
    * Checks if the given value is above minimum value.
    */
  def above(value: Double, min: Double): Boolean = js.native
  
  /**
    * Checks if the given value matches affirmative regexp.
    */
  def affirmative(value: Any): Boolean = js.native
  
  /**
    * Checks if the given value matches alpha numeric regexp.
    */
  def alphaNumeric(value: Any): Boolean = js.native
  
  /**
    * Checks if current device has Android.
    */
  def android(): Boolean = js.native
  
  /**
    * Checks if current device is Android phone.
    */
  def androidPhone(): Boolean = js.native
  
  /**
    * Checks if current device is Android tablet.
    */
  def androidTablet(): Boolean = js.native
  
  //#region Type checks
  /**
    * Checks if the given value type is arguments.
    */
  def arguments(value: Any): Boolean = js.native
  
  /**
    * Checks if the given value type is array.
    */
  def array(value: Any): Boolean = js.native
  
  /**
    * Checks if current device is Blackberry.
    */
  def blackberry(): Boolean = js.native
  
  /**
    * Checks if the given value type is boolean.
    */
  def boolean(value: Any): Boolean = js.native
  
  /**
    * Checks if the given value matches Canada postal code regexp.
    */
  def caPostalCode(value: Any): Boolean = js.native
  
  /**
    * Checks if the given string is capitalized.
    */
  def capitalized(value: String): Boolean = js.native
  
  /**
    * Checks if the given value type is char.
    */
  def char(value: Any): Boolean = js.native
  
  /**
    * Checks if current browser is chrome.
    * @param value Optional version range of browser
    */
  def chrome(): Boolean = js.native
  def chrome(range: EnvironmentVersionRange): Boolean = js.native
  
  /**
    * Checks if the given value matches credit card regexp.
    */
  def creditCard(value: Any): Boolean = js.native
  
  /**
    * Checks if the given value type is date.
    */
  def date(value: Any): Boolean = js.native
  
  /**
    * Checks if the given value matches date string regexp.
    */
  def dateString(value: Any): Boolean = js.native
  
  /**
    * Checks if the given date objects' day equal given dayString parameter.
    */
  def day(value: js.Date, dayString: String): Boolean = js.native
  
  /**
    * Checks if the given date is in daylight saving time.
    */
  def dayLightSavingTime(value: js.Date): Boolean = js.native
  
  /**
    * Checks if the given value is decimal.
    */
  def decimal(value: Double): Boolean = js.native
  
  /**
    * Checks if the given value type is defined.
    */
  def defined(value: Any): Boolean = js.native
  
  /**
    * Checks if current device is desktop.
    */
  def desktop(): Boolean = js.native
  
  /**
    * Checks if the given object is a dom node.
    */
  def domNode(value: Any): Boolean = js.native
  
  /**
    * Checks if current browser is edge.
    * @param value Optional version range of browser
    */
  def edge(): Boolean = js.native
  def edge(range: EnvironmentVersionRange): Boolean = js.native
  
  /**
    * Checks if the given value matches email regexp.
    */
  def email(value: Any): Boolean = js.native
  
  //#endregion
  //#region Presence checks
  /**
    * Checks if the given value is empty.
    */
  def empty(value: Any): Boolean = js.native
  
  /**
    * Checks if the given string ends with substring.
    */
  def endWith(value1: String, value2: String): Boolean = js.native
  
  /**
    * Checks if the given value matches extensible provisioning protocol phone regexp.
    */
  def eppPhone(value: Any): Boolean = js.native
  
  //#endregion
  //#region Arithmetic checks
  /**
    * Checks if the given values are equal.
    */
  def equal(value1: Any, value2: Any): Boolean = js.native
  
  /**
    * Checks if the given value type is error.
    */
  def error(value: Any): Boolean = js.native
  
  /**
    * Checks if the given value is even.
    */
  def even(value: Double): Boolean = js.native
  
  /**
    * Checks if the given value is existy. (not null or undefined)
    */
  def existy(value: Any): Boolean = js.native
  
  /**
    * Checks if the given value is falsy.
    */
  def falsy(value: Any): Boolean = js.native
  
  /**
    * Checks if the given value is finite.
    */
  def finite(value: Double): Boolean = js.native
  
  /**
    * Checks if current browser is firefox.
    * @param value Optional version range of browser
    */
  def firefox(): Boolean = js.native
  def firefox(range: EnvironmentVersionRange): Boolean = js.native
  
  /**
    * Checks if the given value type is function.
    */
  def fn(value: Any): Boolean = js.native
  
  /**
    * Checks if the given value type is function.
    */
  def function(value: Any): Boolean = js.native
  
  /**
    * Checks if the given date object indicate future.
    */
  def future(value: js.Date): Boolean = js.native
  
  /**
    * Checks if the given value matches hexcolor regexp.
    */
  def hexColor(value: Any): Boolean = js.native
  
  /**
    * Checks if the given value matches hexadecimal regexp.
    */
  def hexadecimal(value: Any): Boolean = js.native
  
  //#endregion
  //#region Environment checks
  /**
    * Checks if current browser is ie
    * @param value Optional version range of browser
    */
  def ie(): Boolean = js.native
  def ie(range: EnvironmentVersionRange): Boolean = js.native
  
  //#endregion
  //#region Array checks
  /**
    * Checks if the given item is in array.
    */
  def inArray[T](value: T, array: js.Array[T]): Boolean = js.native
  
  /**
    * Checks if date is within given range.
    */
  def inDateRange(value: js.Date, start: js.Date, end: js.Date): Boolean = js.native
  
  /**
    * Checks if the given date is between now and a month ago.
    */
  def inLastMonth(value: js.Date): Boolean = js.native
  
  /**
    * Checks if the given date is between now and 7 days ago.
    */
  def inLastWeek(value: js.Date): Boolean = js.native
  
  /**
    * Checks if the given date is between now and a year ago.
    */
  def inLastYear(value: js.Date): Boolean = js.native
  
  /**
    * Checks if the given date is between now and a month later.
    */
  def inNextMonth(value: js.Date): Boolean = js.native
  
  /**
    * Checks if the given date is between now and 7 days later.
    */
  def inNextWeek(value: js.Date): Boolean = js.native
  
  /**
    * Checks if the given date is between now and a year later.
    */
  def inNextYear(value: js.Date): Boolean = js.native
  
  //#endregion
  //#region String checks
  /**
    * Checks if the given string contains a substring.
    */
  def include(value1: String, value2: String): Boolean = js.native
  
  /**
    * Checks if the given value is infinite.
    */
  def infinite(value: Double): Boolean = js.native
  
  /**
    * Checks if the given value is integer.
    */
  def integer(value: Double): Boolean = js.native
  
  /**
    * Checks if current device has ios.
    */
  def ios(): Boolean = js.native
  
  /**
    * Checks if the given value matches ip regexp.
    */
  def ip(value: Any): Boolean = js.native
  
  /**
    * Checks if current device is iPad.
    * @param value Optional version range of device
    */
  def ipad(): Boolean = js.native
  def ipad(range: EnvironmentVersionRange): Boolean = js.native
  
  /**
    * Checks if current device is iPhone.
    * @param value Optional version range of device
    */
  def iphone(): Boolean = js.native
  def iphone(range: EnvironmentVersionRange): Boolean = js.native
  
  /**
    * Checks if current device is iPod.
    * @param value Optional version range of device
    */
  def ipod(): Boolean = js.native
  def ipod(range: EnvironmentVersionRange): Boolean = js.native
  
  /**
    * Checks if the given value matches ipv4 regexp
    */
  def ipv4(value: Any): Boolean = js.native
  
  /**
    * Checks if the given value matches ipv6 regexp
    */
  def ipv6(value: Any): Boolean = js.native
  
  /**
    * Checks if the given value type is pure json object.
    */
  def json(value: Any): Boolean = js.native
  
  /**
    * Checks if the given year number is a leap year
    */
  def leapYear(value: Double): Boolean = js.native
  
  /**
    * Checks if current OS is linux.
    */
  def linux(): Boolean = js.native
  
  /**
    * Checks if the given string is lowercase.
    */
  def lowerCase(value: String): Boolean = js.native
  
  /**
    * Checks if current OS is Mac OS X.
    */
  def mac(): Boolean = js.native
  
  /**
    * Checks if current device is mobile.
    */
  def mobile(): Boolean = js.native
  
  /**
    * Checks if the given date objects' month equal given monthString parameter.
    */
  def month(value: js.Date, monthString: String): Boolean = js.native
  
  /**
    * Checks if the given value type is NaN.
    */
  def nan(value: Any): Boolean = js.native
  
  /**
    * Checks if the given value matches North American numbering plan phone regexp.
    */
  def nanpPhone(value: Any): Boolean = js.native
  
  /**
    * Checks if the given value is negative.
    */
  def negative(value: Double): Boolean = js.native
  
  /**
    * Checks if the given value type is null.
    */
  def `null`(value: Any): Boolean = js.native
  
  /**
    * Checks if the given value type is number.
    */
  def number(value: Any): Boolean = js.native
  
  /**
    * Checks if the given value type is object.
    */
  def `object`(value: Any): Boolean = js.native
  
  /**
    * Checks if the given value is odd.
    */
  def odd(value: Double): Boolean = js.native
  
  /**
    * Checks if current device is offline.
    */
  def offline(): Boolean = js.native
  
  /**
    * Checks if current device is online.
    */
  def online(): Boolean = js.native
  
  /**
    * Checks if current browser is opera.
    * @param value Optional version range of browser
    */
  def opera(): Boolean = js.native
  def opera(range: EnvironmentVersionRange): Boolean = js.native
  
  /**
    * Checks if the given string is palindrome.
    */
  def palindrome(value: String): Boolean = js.native
  
  /**
    * Checks if the given date object indicate past.
    */
  def past(value: js.Date): Boolean = js.native
  
  /**
    * Checks if current browser is phantom.
    * @param value Optional version range of browser
    */
  def phantom(): Boolean = js.native
  def phantom(range: EnvironmentVersionRange): Boolean = js.native
  
  /**
    * Checks if the given value is positive.
    */
  def positive(value: Double): Boolean = js.native
  
  //#endregion
  //#region Object checks
  /**
    * Checks if objects' property count is equal to given count.
    */
  def propertyCount(value: Any, count: Double): Boolean = js.native
  
  /**
    * Checks if the given property is defined on object.
    */
  def propertyDefined(value: Any, property: String): Boolean = js.native
  
  /**
    * Checks if the given date is in the parameter quarter.
    */
  def quarterOfYear(value: js.Date, quarter: Double): Boolean = js.native
  
  /**
    * Checks if the given value type is RegExp.
    */
  def regexp(value: Any): Boolean = js.native
  
  /**
    * Checks if current browser is safari.
    * @param value Optional version range of browser
    */
  def safari(): Boolean = js.native
  def safari(range: EnvironmentVersionRange): Boolean = js.native
  
  /**
    * Checks if the given value types are same type.
    */
  def sameType(value1: Any, value2: Any): Boolean = js.native
  
  /**
    * Checks if the given value matches social security number regexp.
    */
  def socialSecurityNumber(value: Any): Boolean = js.native
  
  /**
    * Checks if the given array is sorted.
    */
  def sorted(value: js.Array[Any]): Boolean = js.native
  
  /**
    * Checks if the given value is space.
    */
  def space(value: Any): Boolean = js.native
  
  /**
    * Checks if the given string starts with substring.
    */
  def startWith(value1: String, value2: String): Boolean = js.native
  
  /**
    * Checks if the given value type is string.
    */
  def string(value: Any): Boolean = js.native
  
  /**
    * Checks if current device is tablet.
    */
  def tablet(): Boolean = js.native
  
  /**
    * Checks if the given value matches time string regexp.
    */
  def timeString(value: Any): Boolean = js.native
  
  //#endregion
  //#region Time checks
  /**
    * Checks if the given date object indicate today.
    */
  def today(value: js.Date): Boolean = js.native
  
  /**
    * Checks if the given date object indicate tomorrow.
    */
  def tomorrow(value: js.Date): Boolean = js.native
  
  /**
    * Checks if current device supports touch.
    */
  def touchDevice(): Boolean = js.native
  
  /**
    * Checks if the given value is truthy. (existy and not false)
    */
  def truthy(value: Any): Boolean = js.native
  
  /**
    * Checks if the given value matches UK post code regexp.
    */
  def ukPostCode(value: Any): Boolean = js.native
  
  /**
    * Checks if the given value type is undefined.
    */
  def undefined(value: Any): Boolean = js.native
  
  /**
    * Checks if the given value is under maximum value.
    */
  def under(value: Double, max: Double): Boolean = js.native
  
  /**
    * Checks if the given string is UPPERCASE.
    */
  def upperCase(value: String): Boolean = js.native
  
  //#endregion
  //#region RegExp checks
  /**
    * Checks if the given value matches url regexp.
    */
  def url(value: Any): Boolean = js.native
  
  /**
    * Checks if the given value matches US zip code regexp.
    */
  def usZipCode(value: Any): Boolean = js.native
  
  /**
    * Checks if the given date objects' day is weekday.
    */
  def weekday(value: js.Date): Boolean = js.native
  
  /**
    * Checks if the given date objects' day is weekend.
    */
  def weekend(value: js.Date): Boolean = js.native
  
  /**
    * Checks if the given object is window object.
    */
  def windowObject(value: Any): Boolean = js.native
  
  /**
    * Checks if current OS is Windows.
    */
  def windows(): Boolean = js.native
  
  /**
    * Checks if current device is Windows phone.
    */
  def windowsPhone(): Boolean = js.native
  
  /**
    * Checks if current device is Windows tablet.
    */
  def windowsTablet(): Boolean = js.native
  
  /**
    * Checks if the given value is within minimum and maximum values.
    */
  def within(value: Double, min: Double, max: Double): Boolean = js.native
  
  /**
    * Checks if the given date objects' year equal given yearNumber parameter.
    */
  def year(value: js.Date, yearNumber: Double): Boolean = js.native
  
  /**
    * Checks if the given date object indicate yesterday.
    */
  def yesterday(value: js.Date): Boolean = js.native
}
