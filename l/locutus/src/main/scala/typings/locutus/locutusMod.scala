package typings.locutus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("locutus", JSImport.Namespace)
@js.native
object locutusMod extends js.Object {
  @JSName("c")
  @js.native
  object cNs extends js.Object {
    @JSName("math")
    @js.native
    object mathNs extends js.Object {
      def abs(): js.Any = js.native
      def abs(mixedNumber: js.Any): js.Any = js.native
    }
    
  }
  
  @JSName("golang")
  @js.native
  object golangNs extends js.Object {
    @JSName("strings")
    @js.native
    object stringsNs extends js.Object {
      def Contains(): js.Any = js.native
      def Contains(s: js.Any): js.Any = js.native
      def Contains(s: js.Any, substr: js.Any): js.Any = js.native
      def Count(): js.Any = js.native
      def Count(s: js.Any): js.Any = js.native
      def Count(s: js.Any, sep: js.Any): js.Any = js.native
      def Index(): js.Any = js.native
      def Index(s: js.Any): js.Any = js.native
      def Index(s: js.Any, sep: js.Any): js.Any = js.native
      def LastIndex(): js.Any = js.native
      def LastIndex(s: js.Any): js.Any = js.native
      def LastIndex(s: js.Any, sep: js.Any): js.Any = js.native
    }
    
  }
  
  @JSName("php")
  @js.native
  object phpNs extends js.Object {
    @JSName("array")
    @js.native
    object arrayNs extends js.Object {
      def array_change_key_case(): js.Any = js.native
      def array_change_key_case(array: js.Any): js.Any = js.native
      def array_change_key_case(array: js.Any, cs: js.Any): js.Any = js.native
      def array_chunk(): js.Any = js.native
      def array_chunk(input: js.Any): js.Any = js.native
      def array_chunk(input: js.Any, size: js.Any): js.Any = js.native
      def array_chunk(input: js.Any, size: js.Any, preserveKeys: js.Any): js.Any = js.native
      def array_combine(): js.Any = js.native
      def array_combine(keys: js.Any): js.Any = js.native
      def array_combine(keys: js.Any, values: js.Any): js.Any = js.native
      def array_count_values(): js.Any = js.native
      def array_count_values(array: js.Any): js.Any = js.native
      def array_diff(args: js.Any*): js.Any = js.native
      def array_diff_assoc(args: js.Any*): js.Any = js.native
      def array_diff_key(args: js.Any*): js.Any = js.native
      def array_diff_uassoc(args: js.Any*): js.Any = js.native
      def array_diff_ukey(args: js.Any*): js.Any = js.native
      def array_fill(): js.Any = js.native
      def array_fill(startIndex: js.Any): js.Any = js.native
      def array_fill(startIndex: js.Any, num: js.Any): js.Any = js.native
      def array_fill(startIndex: js.Any, num: js.Any, mixedVal: js.Any): js.Any = js.native
      def array_fill_keys(): js.Any = js.native
      def array_fill_keys(keys: js.Any): js.Any = js.native
      def array_fill_keys(keys: js.Any, value: js.Any): js.Any = js.native
      def array_filter(): js.Any = js.native
      def array_filter(arr: js.Any): js.Any = js.native
      def array_filter(arr: js.Any, func: js.Any): js.Any = js.native
      def array_flip(): js.Any = js.native
      def array_flip(trans: js.Any): js.Any = js.native
      def array_intersect(args: js.Any*): js.Any = js.native
      def array_intersect_assoc(args: js.Any*): js.Any = js.native
      def array_intersect_key(args: js.Any*): js.Any = js.native
      def array_intersect_uassoc(args: js.Any*): js.Any = js.native
      def array_intersect_ukey(args: js.Any*): js.Any = js.native
      def array_key_exists(): js.Any = js.native
      def array_key_exists(key: js.Any): js.Any = js.native
      def array_key_exists(key: js.Any, search: js.Any): js.Any = js.native
      def array_keys(): js.Any = js.native
      def array_keys(input: js.Any): js.Any = js.native
      def array_keys(input: js.Any, searchValue: js.Any): js.Any = js.native
      def array_keys(input: js.Any, searchValue: js.Any, argStrict: js.Any): js.Any = js.native
      def array_map(args: js.Any*): js.Any = js.native
      def array_merge(args: js.Any*): js.Any = js.native
      def array_merge_recursive(): js.Any = js.native
      def array_merge_recursive(arr1: js.Any): js.Any = js.native
      def array_merge_recursive(arr1: js.Any, arr2: js.Any): js.Any = js.native
      def array_multisort(args: js.Any*): js.Any = js.native
      def array_pad(): js.Any = js.native
      def array_pad(input: js.Any): js.Any = js.native
      def array_pad(input: js.Any, padSize: js.Any): js.Any = js.native
      def array_pad(input: js.Any, padSize: js.Any, padValue: js.Any): js.Any = js.native
      def array_pop(): js.Any = js.native
      def array_pop(inputArr: js.Any): js.Any = js.native
      def array_product(): js.Any = js.native
      def array_product(input: js.Any): js.Any = js.native
      def array_push(args: js.Any*): js.Any = js.native
      def array_rand(): js.Any = js.native
      def array_rand(input: js.Any): js.Any = js.native
      def array_rand(input: js.Any, numReq: js.Any): js.Any = js.native
      def array_reduce(): js.Any = js.native
      def array_reduce(aInput: js.Any): js.Any = js.native
      def array_reduce(aInput: js.Any, callback: js.Any): js.Any = js.native
      def array_replace(args: js.Any*): js.Any = js.native
      def array_replace_recursive(args: js.Any*): js.Any = js.native
      def array_reverse(): js.Any = js.native
      def array_reverse(array: js.Any): js.Any = js.native
      def array_reverse(array: js.Any, preserveKeys: js.Any): js.Any = js.native
      def array_search(): js.Any = js.native
      def array_search(needle: js.Any): js.Any = js.native
      def array_search(needle: js.Any, haystack: js.Any): js.Any = js.native
      def array_search(needle: js.Any, haystack: js.Any, argStrict: js.Any): js.Any = js.native
      def array_shift(): js.Any = js.native
      def array_shift(inputArr: js.Any): js.Any = js.native
      def array_slice(): js.Any = js.native
      def array_slice(arr: js.Any): js.Any = js.native
      def array_slice(arr: js.Any, offst: js.Any): js.Any = js.native
      def array_slice(arr: js.Any, offst: js.Any, lgth: js.Any): js.Any = js.native
      def array_slice(arr: js.Any, offst: js.Any, lgth: js.Any, preserveKeys: js.Any): js.Any = js.native
      def array_splice(): js.Any = js.native
      def array_splice(arr: js.Any): js.Any = js.native
      def array_splice(arr: js.Any, offst: js.Any): js.Any = js.native
      def array_splice(arr: js.Any, offst: js.Any, lgth: js.Any): js.Any = js.native
      def array_splice(arr: js.Any, offst: js.Any, lgth: js.Any, replacement: js.Any): js.Any = js.native
      def array_sum(): js.Any = js.native
      def array_sum(array: js.Any): js.Any = js.native
      def array_udiff(args: js.Any*): js.Any = js.native
      def array_udiff_assoc(args: js.Any*): js.Any = js.native
      def array_udiff_uassoc(args: js.Any*): js.Any = js.native
      def array_uintersect(args: js.Any*): js.Any = js.native
      def array_uintersect_uassoc(args: js.Any*): js.Any = js.native
      def array_unique(): js.Any = js.native
      def array_unique(inputArr: js.Any): js.Any = js.native
      def array_unshift(args: js.Any*): js.Any = js.native
      def array_values(): js.Any = js.native
      def array_values(input: js.Any): js.Any = js.native
      def array_walk(args: js.Any*): js.Any = js.native
      def arsort(): js.Any = js.native
      def arsort(inputArr: js.Any): js.Any = js.native
      def arsort(inputArr: js.Any, sortFlags: js.Any): js.Any = js.native
      def asort(): js.Any = js.native
      def asort(inputArr: js.Any): js.Any = js.native
      def asort(inputArr: js.Any, sortFlags: js.Any): js.Any = js.native
      def count(): js.Any = js.native
      def count(mixedVar: js.Any): js.Any = js.native
      def count(mixedVar: js.Any, mode: js.Any): js.Any = js.native
      def current(): js.Any = js.native
      def current(arr: js.Any): js.Any = js.native
      def each(): js.Any = js.native
      def each(arr: js.Any): js.Any = js.native
      def end(): js.Any = js.native
      def end(arr: js.Any): js.Any = js.native
      def in_array(): js.Any = js.native
      def in_array(needle: js.Any): js.Any = js.native
      def in_array(needle: js.Any, haystack: js.Any): js.Any = js.native
      def in_array(needle: js.Any, haystack: js.Any, argStrict: js.Any): js.Any = js.native
      def key(): js.Any = js.native
      def key(arr: js.Any): js.Any = js.native
      def krsort(): js.Any = js.native
      def krsort(inputArr: js.Any): js.Any = js.native
      def krsort(inputArr: js.Any, sortFlags: js.Any): js.Any = js.native
      def ksort(): js.Any = js.native
      def ksort(inputArr: js.Any): js.Any = js.native
      def ksort(inputArr: js.Any, sortFlags: js.Any): js.Any = js.native
      def natcasesort(): js.Any = js.native
      def natcasesort(inputArr: js.Any): js.Any = js.native
      def natsort(): js.Any = js.native
      def natsort(inputArr: js.Any): js.Any = js.native
      def next(): js.Any = js.native
      def next(arr: js.Any): js.Any = js.native
      def pos(): js.Any = js.native
      def pos(arr: js.Any): js.Any = js.native
      def prev(): js.Any = js.native
      def prev(arr: js.Any): js.Any = js.native
      def range(): js.Any = js.native
      def range(low: js.Any): js.Any = js.native
      def range(low: js.Any, high: js.Any): js.Any = js.native
      def range(low: js.Any, high: js.Any, step: js.Any): js.Any = js.native
      def reset(): js.Any = js.native
      def reset(arr: js.Any): js.Any = js.native
      def rsort(): js.Any = js.native
      def rsort(inputArr: js.Any): js.Any = js.native
      def rsort(inputArr: js.Any, sortFlags: js.Any): js.Any = js.native
      def shuffle(): js.Any = js.native
      def shuffle(inputArr: js.Any): js.Any = js.native
      def sizeof(): js.Any = js.native
      def sizeof(mixedVar: js.Any): js.Any = js.native
      def sizeof(mixedVar: js.Any, mode: js.Any): js.Any = js.native
      def sort(): js.Any = js.native
      def sort(inputArr: js.Any): js.Any = js.native
      def sort(inputArr: js.Any, sortFlags: js.Any): js.Any = js.native
      def uasort(): js.Any = js.native
      def uasort(inputArr: js.Any): js.Any = js.native
      def uasort(inputArr: js.Any, sorter: js.Any): js.Any = js.native
      def uksort(): js.Any = js.native
      def uksort(inputArr: js.Any): js.Any = js.native
      def uksort(inputArr: js.Any, sorter: js.Any): js.Any = js.native
      def usort(): js.Any = js.native
      def usort(inputArr: js.Any): js.Any = js.native
      def usort(inputArr: js.Any, sorter: js.Any): js.Any = js.native
    }
    
    @JSName("bc")
    @js.native
    object bcNs extends js.Object {
      def bcadd(): js.Any = js.native
      def bcadd(leftOperand: js.Any): js.Any = js.native
      def bcadd(leftOperand: js.Any, rightOperand: js.Any): js.Any = js.native
      def bcadd(leftOperand: js.Any, rightOperand: js.Any, scale: js.Any): js.Any = js.native
      def bccomp(): js.Any = js.native
      def bccomp(leftOperand: js.Any): js.Any = js.native
      def bccomp(leftOperand: js.Any, rightOperand: js.Any): js.Any = js.native
      def bccomp(leftOperand: js.Any, rightOperand: js.Any, scale: js.Any): js.Any = js.native
      def bcdiv(): js.Any = js.native
      def bcdiv(leftOperand: js.Any): js.Any = js.native
      def bcdiv(leftOperand: js.Any, rightOperand: js.Any): js.Any = js.native
      def bcdiv(leftOperand: js.Any, rightOperand: js.Any, scale: js.Any): js.Any = js.native
      def bcmul(): js.Any = js.native
      def bcmul(leftOperand: js.Any): js.Any = js.native
      def bcmul(leftOperand: js.Any, rightOperand: js.Any): js.Any = js.native
      def bcmul(leftOperand: js.Any, rightOperand: js.Any, scale: js.Any): js.Any = js.native
      def bcround(): js.Any = js.native
      def bcround(`val`: js.Any): js.Any = js.native
      def bcround(`val`: js.Any, precision: js.Any): js.Any = js.native
      def bcscale(): js.Any = js.native
      def bcscale(scale: js.Any): js.Any = js.native
      def bcsub(): js.Any = js.native
      def bcsub(leftOperand: js.Any): js.Any = js.native
      def bcsub(leftOperand: js.Any, rightOperand: js.Any): js.Any = js.native
      def bcsub(leftOperand: js.Any, rightOperand: js.Any, scale: js.Any): js.Any = js.native
    }
    
    @JSName("ctype")
    @js.native
    object ctypeNs extends js.Object {
      def ctype_alnum(): js.Any = js.native
      def ctype_alnum(text: js.Any): js.Any = js.native
      def ctype_alpha(): js.Any = js.native
      def ctype_alpha(text: js.Any): js.Any = js.native
      def ctype_cntrl(): js.Any = js.native
      def ctype_cntrl(text: js.Any): js.Any = js.native
      def ctype_digit(): js.Any = js.native
      def ctype_digit(text: js.Any): js.Any = js.native
      def ctype_graph(): js.Any = js.native
      def ctype_graph(text: js.Any): js.Any = js.native
      def ctype_lower(): js.Any = js.native
      def ctype_lower(text: js.Any): js.Any = js.native
      def ctype_print(): js.Any = js.native
      def ctype_print(text: js.Any): js.Any = js.native
      def ctype_punct(): js.Any = js.native
      def ctype_punct(text: js.Any): js.Any = js.native
      def ctype_space(): js.Any = js.native
      def ctype_space(text: js.Any): js.Any = js.native
      def ctype_upper(): js.Any = js.native
      def ctype_upper(text: js.Any): js.Any = js.native
      def ctype_xdigit(): js.Any = js.native
      def ctype_xdigit(text: js.Any): js.Any = js.native
    }
    
    @JSName("datetime")
    @js.native
    object datetimeNs extends js.Object {
      def checkdate(): js.Any = js.native
      def checkdate(m: js.Any): js.Any = js.native
      def checkdate(m: js.Any, d: js.Any): js.Any = js.native
      def checkdate(m: js.Any, d: js.Any, y: js.Any): js.Any = js.native
      def date(): js.Any = js.native
      def date(format: js.Any): js.Any = js.native
      def date(format: js.Any, timestamp: js.Any): js.Any = js.native
      def date_parse(): js.Any = js.native
      def date_parse(date: js.Any): js.Any = js.native
      def getdate(): js.Any = js.native
      def getdate(timestamp: js.Any): js.Any = js.native
      def gettimeofday(): js.Any = js.native
      def gettimeofday(returnFloat: js.Any): js.Any = js.native
      def gmdate(): js.Any = js.native
      def gmdate(format: js.Any): js.Any = js.native
      def gmdate(format: js.Any, timestamp: js.Any): js.Any = js.native
      def gmmktime(args: js.Any*): js.Any = js.native
      def gmstrftime(): js.Any = js.native
      def gmstrftime(format: js.Any): js.Any = js.native
      def gmstrftime(format: js.Any, timestamp: js.Any): js.Any = js.native
      def idate(): js.Any = js.native
      def idate(format: js.Any): js.Any = js.native
      def idate(format: js.Any, timestamp: js.Any): js.Any = js.native
      def microtime(): js.Any = js.native
      def microtime(getAsFloat: js.Any): js.Any = js.native
      def mktime(args: js.Any*): js.Any = js.native
      def strftime(): js.Any = js.native
      def strftime(fmt: js.Any): js.Any = js.native
      def strftime(fmt: js.Any, timestamp: js.Any): js.Any = js.native
      def strptime(): js.Any = js.native
      def strptime(dateStr: js.Any): js.Any = js.native
      def strptime(dateStr: js.Any, format: js.Any): js.Any = js.native
      def strtotime(): js.Any = js.native
      def strtotime(text: js.Any): js.Any = js.native
      def strtotime(text: js.Any, now: js.Any): js.Any = js.native
      def time(): js.Any = js.native
    }
    
    @JSName("exec")
    @js.native
    object execNs extends js.Object {
      def escapeshellarg(): js.Any = js.native
      def escapeshellarg(arg: js.Any): js.Any = js.native
    }
    
    @JSName("filesystem")
    @js.native
    object filesystemNs extends js.Object {
      def basename(): js.Any = js.native
      def basename(path: js.Any): js.Any = js.native
      def basename(path: js.Any, suffix: js.Any): js.Any = js.native
      def dirname(): js.Any = js.native
      def dirname(path: js.Any): js.Any = js.native
      def file_get_contents(): js.Any = js.native
      def file_get_contents(url: js.Any): js.Any = js.native
      def file_get_contents(url: js.Any, flags: js.Any): js.Any = js.native
      def file_get_contents(url: js.Any, flags: js.Any, context: js.Any): js.Any = js.native
      def file_get_contents(url: js.Any, flags: js.Any, context: js.Any, offset: js.Any): js.Any = js.native
      def file_get_contents(url: js.Any, flags: js.Any, context: js.Any, offset: js.Any, maxLen: js.Any): js.Any = js.native
      def pathinfo(args: js.Any*): js.Any = js.native
      def realpath(): js.Any = js.native
      def realpath(path: js.Any): js.Any = js.native
    }
    
    @JSName("funchand")
    @js.native
    object funchandNs extends js.Object {
      def call_user_func(args: js.Any*): js.Any = js.native
      def call_user_func_array(): js.Any = js.native
      def call_user_func_array(cb: js.Any): js.Any = js.native
      def call_user_func_array(cb: js.Any, parameters: js.Any): js.Any = js.native
      def create_function(): js.Any = js.native
      def create_function(args: js.Any): js.Any = js.native
      def create_function(args: js.Any, code: js.Any): js.Any = js.native
      def function_exists(): js.Any = js.native
      def function_exists(funcName: js.Any): js.Any = js.native
      def get_defined_functions(): js.Any = js.native
    }
    
    @JSName("i18n")
    @js.native
    object i18nNs extends js.Object {
      def i18n_loc_get_default(): js.Any = js.native
      def i18n_loc_set_default(): js.Any = js.native
      def i18n_loc_set_default(name: js.Any): js.Any = js.native
    }
    
    @JSName("info")
    @js.native
    object infoNs extends js.Object {
      def assert_options(): js.Any = js.native
      def assert_options(what: js.Any): js.Any = js.native
      def assert_options(what: js.Any, value: js.Any): js.Any = js.native
      def getenv(): js.Any = js.native
      def getenv(varname: js.Any): js.Any = js.native
      def ini_get(): js.Any = js.native
      def ini_get(varname: js.Any): js.Any = js.native
      def ini_set(): js.Any = js.native
      def ini_set(varname: js.Any): js.Any = js.native
      def ini_set(varname: js.Any, newvalue: js.Any): js.Any = js.native
      def set_time_limit(): js.Any = js.native
      def set_time_limit(seconds: js.Any): js.Any = js.native
      def version_compare(): js.Any = js.native
      def version_compare(v1: js.Any): js.Any = js.native
      def version_compare(v1: js.Any, v2: js.Any): js.Any = js.native
      def version_compare(v1: js.Any, v2: js.Any, operator: js.Any): js.Any = js.native
    }
    
    @JSName("json")
    @js.native
    object jsonNs extends js.Object {
      def json_decode(): js.Any = js.native
      def json_decode(strJson: js.Any): js.Any = js.native
      def json_encode(): js.Any = js.native
      def json_encode(mixedVal: js.Any): js.Any = js.native
      def json_last_error(): js.Any = js.native
    }
    
    @JSName("math")
    @js.native
    object mathNs extends js.Object {
      def abs(): js.Any = js.native
      def abs(mixedNumber: js.Any): js.Any = js.native
      def acos(): js.Any = js.native
      def acos(arg: js.Any): js.Any = js.native
      def acosh(): js.Any = js.native
      def acosh(arg: js.Any): js.Any = js.native
      def asin(): js.Any = js.native
      def asin(arg: js.Any): js.Any = js.native
      def asinh(): js.Any = js.native
      def asinh(arg: js.Any): js.Any = js.native
      def atan(): js.Any = js.native
      def atan(arg: js.Any): js.Any = js.native
      def atan2(): js.Any = js.native
      def atan2(y: js.Any): js.Any = js.native
      def atan2(y: js.Any, x: js.Any): js.Any = js.native
      def atanh(): js.Any = js.native
      def atanh(arg: js.Any): js.Any = js.native
      def base_convert(): js.Any = js.native
      def base_convert(number: js.Any): js.Any = js.native
      def base_convert(number: js.Any, frombase: js.Any): js.Any = js.native
      def base_convert(number: js.Any, frombase: js.Any, tobase: js.Any): js.Any = js.native
      def bindec(): js.Any = js.native
      def bindec(binaryString: js.Any): js.Any = js.native
      def ceil(): js.Any = js.native
      def ceil(value: js.Any): js.Any = js.native
      def cos(): js.Any = js.native
      def cos(arg: js.Any): js.Any = js.native
      def cosh(): js.Any = js.native
      def cosh(arg: js.Any): js.Any = js.native
      def decbin(): js.Any = js.native
      def decbin(number: js.Any): js.Any = js.native
      def dechex(): js.Any = js.native
      def dechex(number: js.Any): js.Any = js.native
      def decoct(): js.Any = js.native
      def decoct(number: js.Any): js.Any = js.native
      def deg2rad(): js.Any = js.native
      def deg2rad(angle: js.Any): js.Any = js.native
      def exp(): js.Any = js.native
      def exp(arg: js.Any): js.Any = js.native
      def expm1(): js.Any = js.native
      def expm1(x: js.Any): js.Any = js.native
      def floor(): js.Any = js.native
      def floor(value: js.Any): js.Any = js.native
      def fmod(): js.Any = js.native
      def fmod(x: js.Any): js.Any = js.native
      def fmod(x: js.Any, y: js.Any): js.Any = js.native
      def getrandmax(): js.Any = js.native
      def hexdec(): js.Any = js.native
      def hexdec(hexString: js.Any): js.Any = js.native
      def hypot(): js.Any = js.native
      def hypot(x: js.Any): js.Any = js.native
      def hypot(x: js.Any, y: js.Any): js.Any = js.native
      def is_finite(): js.Any = js.native
      def is_finite(`val`: js.Any): js.Any = js.native
      def is_infinite(): js.Any = js.native
      def is_infinite(`val`: js.Any): js.Any = js.native
      def is_nan(): js.Any = js.native
      def is_nan(`val`: js.Any): js.Any = js.native
      def lcg_value(): js.Any = js.native
      def log(): js.Any = js.native
      def log(arg: js.Any): js.Any = js.native
      def log(arg: js.Any, base: js.Any): js.Any = js.native
      def log10(): js.Any = js.native
      def log10(arg: js.Any): js.Any = js.native
      def log1p(): js.Any = js.native
      def log1p(x: js.Any): js.Any = js.native
      def max(args: js.Any*): js.Any = js.native
      def min(args: js.Any*): js.Any = js.native
      def mt_getrandmax(): js.Any = js.native
      def mt_rand(args: js.Any*): js.Any = js.native
      def octdec(): js.Any = js.native
      def octdec(octString: js.Any): js.Any = js.native
      def pi(): js.Any = js.native
      def pow(): js.Any = js.native
      def pow(base: js.Any): js.Any = js.native
      def pow(base: js.Any, exp: js.Any): js.Any = js.native
      def rad2deg(): js.Any = js.native
      def rad2deg(angle: js.Any): js.Any = js.native
      def rand(args: js.Any*): js.Any = js.native
      def round(args: js.Any*): js.Any = js.native
      def sin(): js.Any = js.native
      def sin(arg: js.Any): js.Any = js.native
      def sinh(): js.Any = js.native
      def sinh(arg: js.Any): js.Any = js.native
      def sqrt(): js.Any = js.native
      def sqrt(arg: js.Any): js.Any = js.native
      def tan(): js.Any = js.native
      def tan(arg: js.Any): js.Any = js.native
      def tanh(): js.Any = js.native
      def tanh(arg: js.Any): js.Any = js.native
    }
    
    @JSName("misc")
    @js.native
    object miscNs extends js.Object {
      def pack(args: js.Any*): js.Any = js.native
      def uniqid(): js.Any = js.native
      def uniqid(prefix: js.Any): js.Any = js.native
      def uniqid(prefix: js.Any, moreEntropy: js.Any): js.Any = js.native
    }
    
    @JSName("network")
    @js.native
    object networkNs extends js.Object {
      def inet_ntop(): js.Any = js.native
      def inet_ntop(a: js.Any): js.Any = js.native
      def inet_pton(): js.Any = js.native
      def inet_pton(a: js.Any): js.Any = js.native
      def ip2long(): js.Any = js.native
      def ip2long(argIP: js.Any): js.Any = js.native
      def long2ip(): js.Any = js.native
      def long2ip(ip: js.Any): js.Any = js.native
      def setcookie(
        name: js.UndefOr[js.Any],
        value: js.UndefOr[js.Any],
        expires: js.UndefOr[js.Any],
        path: js.UndefOr[js.Any],
        domain: js.UndefOr[js.Any],
        secure: js.UndefOr[js.Any]
      ): js.Any = js.native
      def setrawcookie(
        name: js.UndefOr[js.Any],
        value: js.UndefOr[js.Any],
        expires: js.UndefOr[js.Any],
        path: js.UndefOr[js.Any],
        domain: js.UndefOr[js.Any],
        secure: js.UndefOr[js.Any]
      ): js.Any = js.native
    }
    
    @JSName("pcre")
    @js.native
    object pcreNs extends js.Object {
      def preg_quote(): js.Any = js.native
      def preg_quote(str: js.Any): js.Any = js.native
      def preg_quote(str: js.Any, delimiter: js.Any): js.Any = js.native
      def sql_regcase(): js.Any = js.native
      def sql_regcase(str: js.Any): js.Any = js.native
    }
    
    @JSName("strings")
    @js.native
    object stringsNs extends js.Object {
      def addcslashes(): js.Any = js.native
      def addcslashes(str: js.Any): js.Any = js.native
      def addcslashes(str: js.Any, charlist: js.Any): js.Any = js.native
      def addslashes(): js.Any = js.native
      def addslashes(str: js.Any): js.Any = js.native
      def bin2hex(): js.Any = js.native
      def bin2hex(s: js.Any): js.Any = js.native
      def chop(): js.Any = js.native
      def chop(str: js.Any): js.Any = js.native
      def chop(str: js.Any, charlist: js.Any): js.Any = js.native
      def chr(): js.Any = js.native
      def chr(codePt: js.Any): js.Any = js.native
      def chunk_split(): js.Any = js.native
      def chunk_split(body: js.Any): js.Any = js.native
      def chunk_split(body: js.Any, chunklen: js.Any): js.Any = js.native
      def chunk_split(body: js.Any, chunklen: js.Any, end: js.Any): js.Any = js.native
      def convert_cyr_string(): js.Any = js.native
      def convert_cyr_string(str: js.Any): js.Any = js.native
      def convert_cyr_string(str: js.Any, from: js.Any): js.Any = js.native
      def convert_cyr_string(str: js.Any, from: js.Any, to: js.Any): js.Any = js.native
      def convert_uuencode(): js.Any = js.native
      def convert_uuencode(str: js.Any): js.Any = js.native
      def count_chars(): js.Any = js.native
      def count_chars(str: js.Any): js.Any = js.native
      def count_chars(str: js.Any, mode: js.Any): js.Any = js.native
      def crc32(): js.Any = js.native
      def crc32(str: js.Any): js.Any = js.native
      def echo(args: js.Any*): js.Any = js.native
      def explode(args: js.Any*): js.Any = js.native
      def get_html_translation_table(args: js.Any*): js.Any = js.native
      def hex2bin(): js.Any = js.native
      def hex2bin(s: js.Any): js.Any = js.native
      def html_entity_decode(): js.Any = js.native
      def html_entity_decode(string: js.Any): js.Any = js.native
      def html_entity_decode(string: js.Any, quoteStyle: js.Any): js.Any = js.native
      def htmlentities(): js.Any = js.native
      def htmlentities(string: js.Any): js.Any = js.native
      def htmlentities(string: js.Any, quoteStyle: js.Any): js.Any = js.native
      def htmlentities(string: js.Any, quoteStyle: js.Any, charset: js.Any): js.Any = js.native
      def htmlentities(string: js.Any, quoteStyle: js.Any, charset: js.Any, doubleEncode: js.Any): js.Any = js.native
      def htmlspecialchars(): js.Any = js.native
      def htmlspecialchars(string: js.Any): js.Any = js.native
      def htmlspecialchars(string: js.Any, quoteStyle: js.Any): js.Any = js.native
      def htmlspecialchars(string: js.Any, quoteStyle: js.Any, charset: js.Any): js.Any = js.native
      def htmlspecialchars(string: js.Any, quoteStyle: js.Any, charset: js.Any, doubleEncode: js.Any): js.Any = js.native
      def htmlspecialchars_decode(): js.Any = js.native
      def htmlspecialchars_decode(string: js.Any): js.Any = js.native
      def htmlspecialchars_decode(string: js.Any, quoteStyle: js.Any): js.Any = js.native
      def implode(args: js.Any*): js.Any = js.native
      def join(): js.Any = js.native
      def join(glue: js.Any): js.Any = js.native
      def join(glue: js.Any, pieces: js.Any): js.Any = js.native
      def lcfirst(): js.Any = js.native
      def lcfirst(str: js.Any): js.Any = js.native
      def levenshtein(): js.Any = js.native
      def levenshtein(s1: js.Any): js.Any = js.native
      def levenshtein(s1: js.Any, s2: js.Any): js.Any = js.native
      def levenshtein(s1: js.Any, s2: js.Any, costIns: js.Any): js.Any = js.native
      def levenshtein(s1: js.Any, s2: js.Any, costIns: js.Any, costRep: js.Any): js.Any = js.native
      def levenshtein(s1: js.Any, s2: js.Any, costIns: js.Any, costRep: js.Any, costDel: js.Any): js.Any = js.native
      def localeconv(): js.Any = js.native
      def ltrim(): js.Any = js.native
      def ltrim(str: js.Any): js.Any = js.native
      def ltrim(str: js.Any, charlist: js.Any): js.Any = js.native
      def md5(): js.Any = js.native
      def md5(str: js.Any): js.Any = js.native
      def md5_file(): js.Any = js.native
      def md5_file(str_filename: js.Any): js.Any = js.native
      def metaphone(): js.Any = js.native
      def metaphone(word: js.Any): js.Any = js.native
      def metaphone(word: js.Any, maxPhonemes: js.Any): js.Any = js.native
      def money_format(): js.Any = js.native
      def money_format(format: js.Any): js.Any = js.native
      def money_format(format: js.Any, number: js.Any): js.Any = js.native
      def nl2br(): js.Any = js.native
      def nl2br(str: js.Any): js.Any = js.native
      def nl2br(str: js.Any, isXhtml: js.Any): js.Any = js.native
      def nl_langinfo(): js.Any = js.native
      def nl_langinfo(item: js.Any): js.Any = js.native
      def number_format(): js.Any = js.native
      def number_format(number: js.Any): js.Any = js.native
      def number_format(number: js.Any, decimals: js.Any): js.Any = js.native
      def number_format(number: js.Any, decimals: js.Any, decPoint: js.Any): js.Any = js.native
      def number_format(number: js.Any, decimals: js.Any, decPoint: js.Any, thousandsSep: js.Any): js.Any = js.native
      def ord(): js.Any = js.native
      def ord(string: js.Any): js.Any = js.native
      def parse_str(): js.Any = js.native
      def parse_str(str: js.Any): js.Any = js.native
      def parse_str(str: js.Any, array: js.Any): js.Any = js.native
      def printf(args: js.Any*): js.Any = js.native
      def quoted_printable_decode(): js.Any = js.native
      def quoted_printable_decode(str: js.Any): js.Any = js.native
      def quoted_printable_encode(): js.Any = js.native
      def quoted_printable_encode(str: js.Any): js.Any = js.native
      def quotemeta(): js.Any = js.native
      def quotemeta(str: js.Any): js.Any = js.native
      def rtrim(): js.Any = js.native
      def rtrim(str: js.Any): js.Any = js.native
      def rtrim(str: js.Any, charlist: js.Any): js.Any = js.native
      def setlocale(): js.Any = js.native
      def setlocale(category: js.Any): js.Any = js.native
      def setlocale(category: js.Any, locale: js.Any): js.Any = js.native
      def sha1(): js.Any = js.native
      def sha1(str: js.Any): js.Any = js.native
      def sha1_file(): js.Any = js.native
      def sha1_file(str_filename: js.Any): js.Any = js.native
      def similar_text(): js.Any = js.native
      def similar_text(first: js.Any): js.Any = js.native
      def similar_text(first: js.Any, second: js.Any): js.Any = js.native
      def similar_text(first: js.Any, second: js.Any, percent: js.Any): js.Any = js.native
      def soundex(): js.Any = js.native
      def soundex(str: js.Any): js.Any = js.native
      def split(): js.Any = js.native
      def split(delimiter: js.Any): js.Any = js.native
      def split(delimiter: js.Any, string: js.Any): js.Any = js.native
      def sprintf(args: js.Any*): js.Any = js.native
      def sscanf(args: js.Any*): js.Any = js.native
      def str_getcsv(): js.Any = js.native
      def str_getcsv(input: js.Any): js.Any = js.native
      def str_getcsv(input: js.Any, delimiter: js.Any): js.Any = js.native
      def str_getcsv(input: js.Any, delimiter: js.Any, enclosure: js.Any): js.Any = js.native
      def str_getcsv(input: js.Any, delimiter: js.Any, enclosure: js.Any, escape: js.Any): js.Any = js.native
      def str_ireplace(): js.Any = js.native
      def str_ireplace(search: js.Any): js.Any = js.native
      def str_ireplace(search: js.Any, replace: js.Any): js.Any = js.native
      def str_ireplace(search: js.Any, replace: js.Any, subject: js.Any): js.Any = js.native
      def str_ireplace(search: js.Any, replace: js.Any, subject: js.Any, countObj: js.Any): js.Any = js.native
      def str_pad(): js.Any = js.native
      def str_pad(input: js.Any): js.Any = js.native
      def str_pad(input: js.Any, padLength: js.Any): js.Any = js.native
      def str_pad(input: js.Any, padLength: js.Any, padString: js.Any): js.Any = js.native
      def str_pad(input: js.Any, padLength: js.Any, padString: js.Any, padType: js.Any): js.Any = js.native
      def str_repeat(): js.Any = js.native
      def str_repeat(input: js.Any): js.Any = js.native
      def str_repeat(input: js.Any, multiplier: js.Any): js.Any = js.native
      def str_replace(): js.Any = js.native
      def str_replace(search: js.Any): js.Any = js.native
      def str_replace(search: js.Any, replace: js.Any): js.Any = js.native
      def str_replace(search: js.Any, replace: js.Any, subject: js.Any): js.Any = js.native
      def str_replace(search: js.Any, replace: js.Any, subject: js.Any, countObj: js.Any): js.Any = js.native
      def str_rot13(): js.Any = js.native
      def str_rot13(str: js.Any): js.Any = js.native
      def str_shuffle(args: js.Any*): js.Any = js.native
      def str_split(): js.Any = js.native
      def str_split(string: js.Any): js.Any = js.native
      def str_split(string: js.Any, splitLength: js.Any): js.Any = js.native
      def str_word_count(): js.Any = js.native
      def str_word_count(str: js.Any): js.Any = js.native
      def str_word_count(str: js.Any, format: js.Any): js.Any = js.native
      def str_word_count(str: js.Any, format: js.Any, charlist: js.Any): js.Any = js.native
      def strcasecmp(): js.Any = js.native
      def strcasecmp(fString1: js.Any): js.Any = js.native
      def strcasecmp(fString1: js.Any, fString2: js.Any): js.Any = js.native
      def strchr(): js.Any = js.native
      def strchr(haystack: js.Any): js.Any = js.native
      def strchr(haystack: js.Any, needle: js.Any): js.Any = js.native
      def strchr(haystack: js.Any, needle: js.Any, bool: js.Any): js.Any = js.native
      def strcmp(): js.Any = js.native
      def strcmp(str1: js.Any): js.Any = js.native
      def strcmp(str1: js.Any, str2: js.Any): js.Any = js.native
      def strcoll(): js.Any = js.native
      def strcoll(str1: js.Any): js.Any = js.native
      def strcoll(str1: js.Any, str2: js.Any): js.Any = js.native
      def strcspn(): js.Any = js.native
      def strcspn(str: js.Any): js.Any = js.native
      def strcspn(str: js.Any, mask: js.Any): js.Any = js.native
      def strcspn(str: js.Any, mask: js.Any, start: js.Any): js.Any = js.native
      def strcspn(str: js.Any, mask: js.Any, start: js.Any, length: js.Any): js.Any = js.native
      def strip_tags(): js.Any = js.native
      def strip_tags(input: js.Any): js.Any = js.native
      def strip_tags(input: js.Any, allowed: js.Any): js.Any = js.native
      def stripos(): js.Any = js.native
      def stripos(fHaystack: js.Any): js.Any = js.native
      def stripos(fHaystack: js.Any, fNeedle: js.Any): js.Any = js.native
      def stripos(fHaystack: js.Any, fNeedle: js.Any, fOffset: js.Any): js.Any = js.native
      def stripslashes(): js.Any = js.native
      def stripslashes(str: js.Any): js.Any = js.native
      def stristr(): js.Any = js.native
      def stristr(haystack: js.Any): js.Any = js.native
      def stristr(haystack: js.Any, needle: js.Any): js.Any = js.native
      def stristr(haystack: js.Any, needle: js.Any, bool: js.Any): js.Any = js.native
      def strlen(): js.Any = js.native
      def strlen(string: js.Any): js.Any = js.native
      def strnatcasecmp(): js.Any = js.native
      def strnatcasecmp(str1: js.Any): js.Any = js.native
      def strnatcasecmp(str1: js.Any, str2: js.Any): js.Any = js.native
      def strnatcmp(): js.Any = js.native
      def strnatcmp(fString1: js.Any): js.Any = js.native
      def strnatcmp(fString1: js.Any, fString2: js.Any): js.Any = js.native
      def strnatcmp(fString1: js.Any, fString2: js.Any, fVersion: js.Any): js.Any = js.native
      def strncasecmp(): js.Any = js.native
      def strncasecmp(argStr1: js.Any): js.Any = js.native
      def strncasecmp(argStr1: js.Any, argStr2: js.Any): js.Any = js.native
      def strncasecmp(argStr1: js.Any, argStr2: js.Any, len: js.Any): js.Any = js.native
      def strncmp(): js.Any = js.native
      def strncmp(str1: js.Any): js.Any = js.native
      def strncmp(str1: js.Any, str2: js.Any): js.Any = js.native
      def strncmp(str1: js.Any, str2: js.Any, lgth: js.Any): js.Any = js.native
      def strpbrk(): js.Any = js.native
      def strpbrk(haystack: js.Any): js.Any = js.native
      def strpbrk(haystack: js.Any, charList: js.Any): js.Any = js.native
      def strpos(): js.Any = js.native
      def strpos(haystack: js.Any): js.Any = js.native
      def strpos(haystack: js.Any, needle: js.Any): js.Any = js.native
      def strpos(haystack: js.Any, needle: js.Any, offset: js.Any): js.Any = js.native
      def strrchr(): js.Any = js.native
      def strrchr(haystack: js.Any): js.Any = js.native
      def strrchr(haystack: js.Any, needle: js.Any): js.Any = js.native
      def strrev(): js.Any = js.native
      def strrev(string: js.Any): js.Any = js.native
      def strripos(): js.Any = js.native
      def strripos(haystack: js.Any): js.Any = js.native
      def strripos(haystack: js.Any, needle: js.Any): js.Any = js.native
      def strripos(haystack: js.Any, needle: js.Any, offset: js.Any): js.Any = js.native
      def strrpos(): js.Any = js.native
      def strrpos(haystack: js.Any): js.Any = js.native
      def strrpos(haystack: js.Any, needle: js.Any): js.Any = js.native
      def strrpos(haystack: js.Any, needle: js.Any, offset: js.Any): js.Any = js.native
      def strspn(): js.Any = js.native
      def strspn(str1: js.Any): js.Any = js.native
      def strspn(str1: js.Any, str2: js.Any): js.Any = js.native
      def strspn(str1: js.Any, str2: js.Any, start: js.Any): js.Any = js.native
      def strspn(str1: js.Any, str2: js.Any, start: js.Any, lgth: js.Any): js.Any = js.native
      def strstr(): js.Any = js.native
      def strstr(haystack: js.Any): js.Any = js.native
      def strstr(haystack: js.Any, needle: js.Any): js.Any = js.native
      def strstr(haystack: js.Any, needle: js.Any, bool: js.Any): js.Any = js.native
      def strtok(): js.Any = js.native
      def strtok(str: js.Any): js.Any = js.native
      def strtok(str: js.Any, tokens: js.Any): js.Any = js.native
      def strtolower(): js.Any = js.native
      def strtolower(str: js.Any): js.Any = js.native
      def strtoupper(): js.Any = js.native
      def strtoupper(str: js.Any): js.Any = js.native
      def strtr(): js.Any = js.native
      def strtr(str: js.Any): js.Any = js.native
      def strtr(str: js.Any, trFrom: js.Any): js.Any = js.native
      def strtr(str: js.Any, trFrom: js.Any, trTo: js.Any): js.Any = js.native
      def substr(): js.Any = js.native
      def substr(str: js.Any): js.Any = js.native
      def substr(str: js.Any, start: js.Any): js.Any = js.native
      def substr(str: js.Any, start: js.Any, len: js.Any): js.Any = js.native
      def substr_compare(): js.Any = js.native
      def substr_compare(mainStr: js.Any): js.Any = js.native
      def substr_compare(mainStr: js.Any, str: js.Any): js.Any = js.native
      def substr_compare(mainStr: js.Any, str: js.Any, offset: js.Any): js.Any = js.native
      def substr_compare(mainStr: js.Any, str: js.Any, offset: js.Any, length: js.Any): js.Any = js.native
      def substr_compare(mainStr: js.Any, str: js.Any, offset: js.Any, length: js.Any, caseInsensitivity: js.Any): js.Any = js.native
      def substr_count(): js.Any = js.native
      def substr_count(haystack: js.Any): js.Any = js.native
      def substr_count(haystack: js.Any, needle: js.Any): js.Any = js.native
      def substr_count(haystack: js.Any, needle: js.Any, offset: js.Any): js.Any = js.native
      def substr_count(haystack: js.Any, needle: js.Any, offset: js.Any, length: js.Any): js.Any = js.native
      def substr_replace(): js.Any = js.native
      def substr_replace(str: js.Any): js.Any = js.native
      def substr_replace(str: js.Any, replace: js.Any): js.Any = js.native
      def substr_replace(str: js.Any, replace: js.Any, start: js.Any): js.Any = js.native
      def substr_replace(str: js.Any, replace: js.Any, start: js.Any, length: js.Any): js.Any = js.native
      def trim(): js.Any = js.native
      def trim(str: js.Any): js.Any = js.native
      def trim(str: js.Any, charlist: js.Any): js.Any = js.native
      def ucfirst(): js.Any = js.native
      def ucfirst(str: js.Any): js.Any = js.native
      def ucwords(): js.Any = js.native
      def ucwords(str: js.Any): js.Any = js.native
      def vprintf(): js.Any = js.native
      def vprintf(format: js.Any): js.Any = js.native
      def vprintf(format: js.Any, args: js.Any): js.Any = js.native
      def vsprintf(): js.Any = js.native
      def vsprintf(format: js.Any): js.Any = js.native
      def vsprintf(format: js.Any, args: js.Any): js.Any = js.native
      def wordwrap(args: js.Any*): js.Any = js.native
    }
    
    @JSName("url")
    @js.native
    object urlNs extends js.Object {
      def base64_decode(): js.Any = js.native
      def base64_decode(encodedData: js.Any): js.Any = js.native
      def base64_encode(): js.Any = js.native
      def base64_encode(stringToEncode: js.Any): js.Any = js.native
      def http_build_query(): js.Any = js.native
      def http_build_query(formdata: js.Any): js.Any = js.native
      def http_build_query(formdata: js.Any, numericPrefix: js.Any): js.Any = js.native
      def http_build_query(formdata: js.Any, numericPrefix: js.Any, argSeparator: js.Any): js.Any = js.native
      def parse_url(): js.Any = js.native
      def parse_url(str: js.Any): js.Any = js.native
      def parse_url(str: js.Any, component: js.Any): js.Any = js.native
      def rawurldecode(): js.Any = js.native
      def rawurldecode(str: js.Any): js.Any = js.native
      def rawurlencode(): js.Any = js.native
      def rawurlencode(str: js.Any): js.Any = js.native
      def urldecode(): js.Any = js.native
      def urldecode(str: js.Any): js.Any = js.native
      def urlencode(): js.Any = js.native
      def urlencode(str: js.Any): js.Any = js.native
    }
    
    @JSName("xdiff")
    @js.native
    object xdiffNs extends js.Object {
      def xdiff_string_diff(args: js.Any*): js.Any = js.native
      def xdiff_string_patch(args: js.Any*): js.Any = js.native
    }
    
    @JSName("xml")
    @js.native
    object xmlNs extends js.Object {
      def utf8_decode(): js.Any = js.native
      def utf8_decode(strData: js.Any): js.Any = js.native
      def utf8_encode(): js.Any = js.native
      def utf8_encode(argString: js.Any): js.Any = js.native
    }
    
  }
  
  @JSName("python")
  @js.native
  object pythonNs extends js.Object {
    @JSName("string")
    @js.native
    object stringNs extends js.Object {
      def capwords(): js.Any = js.native
      def capwords(str: js.Any): js.Any = js.native
    }
    
  }
  
  @JSName("ruby")
  @js.native
  object rubyNs extends js.Object {
    @JSName("Math")
    @js.native
    object MathNs extends js.Object {
      def acos(): js.Any = js.native
      def acos(arg: js.Any): js.Any = js.native
    }
    
  }
  
}

