package typings.jsonPointer

import org.scalablytyped.runtime.Shortcut
import typings.std.Parameters
import typings.std.Record
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("json-pointer", JSImport.Namespace)
  @js.native
  val ^ : Wrapper & Api = js.native
  
  @js.native
  trait Api extends StObject {
    
    /**
      * Builds a JSON pointer from an array of reference tokens.
      *
      * @example
      * import pointer = require('json-pointer');
      *
      * pointer.compile(['hello', 'bla']); // -> '/hello/bla'
      */
    def compile(tokens: js.Array[String]): String = js.native
    
    /**
      * Creates a dictionary object (pointer -> value).
      *
      * @example
      * import pointer = require('json-pointer');
      *
      * const obj = {
      *     hello: { bla: 'example' }
      * };
      * pointer.dict(obj);
      * // -> { '/hello/bla': 'example' }
      */
    def dict(`object`: JsonObject): Record[String, Any] = js.native
    def dict(`object`: JsonObject, descend: js.Function1[/* value */ Any, Boolean]): Record[String, Any] = js.native
    
    /**
      * Escapes a reference token.
      *
      * @example
      * import pointer = require('json-pointer');
      *
      * pointer.escape('hello~bla'); // -> 'hello~0bla'
      * pointer.escape('hello/bla'); // -> 'hello~1bla'
      */
    def escape(pointer: String): String = js.native
    
    /**
      * Looks up a JSON pointer in an object.
      *
      * @example
      * import pointer = require('json-pointer');
      *
      * const obj = {
      *     example: {
      *         bla: 'hello'
      *     }
      * };
      * pointer.get(obj, '/example/bla');
      * // -> 'hello'
      */
    def get(`object`: JsonObject, pointer: String): Any = js.native
    def get(`object`: JsonObject, pointer: js.Array[String]): Any = js.native
    
    /**
      * Tests if an object has a value for a JSON pointer.
      *
      * @example
      * import pointer = require('json-pointer');
      *
      * const obj = {
      *     bla: 'hello'
      * };
      *
      * pointer.has(obj, '/bla');          // -> true
      * pointer.has(obj, '/non/existing'); // -> false
      */
    def has(`object`: Any, pointer: String): Boolean = js.native
    def has(`object`: Any, pointer: js.Array[String]): Boolean = js.native
    
    /**
      * Converts a JSON pointer into an array of reference tokens.
      *
      * @example
      * import pointer = require('json-pointer');
      *
      * pointer.parse('/hello/bla'); // -> ['hello', 'bla']
      */
    def parse(pointer: String): js.Array[String] = js.native
    
    /**
      * Removes an attribute of object referenced by pointer.
      *
      * @example
      * import pointer = require('json-pointer');
      *
      * const obj = {
      *     example: 'hello'
      * };
      * pointer.remove(obj, '/example');
      * // obj -> {}
      */
    def remove(`object`: JsonObject, pointer: String): Unit = js.native
    def remove(`object`: JsonObject, pointer: js.Array[String]): Unit = js.native
    
    /**
      * Sets a new value on object at the location described by pointer.
      *
      * @example
      * import pointer = require('json-pointer');
      *
      * const obj = {};
      * pointer.set(obj, '/example/bla', 'hello');
      * // obj -> { example: { bla: 'hello' } }
      */
    def set(`object`: JsonObject, pointer: String, value: Any): Api = js.native
    def set(`object`: JsonObject, pointer: js.Array[String], value: Any): Api = js.native
    
    /**
      * Unescape a reference token.
      *
      * @example
      * import pointer = require('json-pointer');
      *
      * pointer.unescape('hello~0bla'); // -> 'hello~bla'
      * pointer.unescape('hello~1bla'); // -> 'hello/bla'
      */
    def unescape(pointer: String): String = js.native
    
    /**
      * Iterates over an object. Just like: `each(pointer.dict(obj), iterator);`.
      */
    def walk(`object`: JsonObject, iterator: js.Function2[/* value */ Any, /* ref */ String, Unit]): Unit = js.native
    def walk(
      `object`: JsonObject,
      iterator: js.Function2[/* value */ Any, /* ref */ String, Unit],
      descend: js.Function1[/* value */ Any, Boolean]
    ): Unit = js.native
  }
  
  /* Inlined {[ key in 'get' | 'remove' | 'dict' | 'walk' | 'has' ]: (params : json-pointer.json-pointer.DropFirst<std.Parameters<json-pointer.json-pointer.Api[key]>>): std.ReturnType<json-pointer.json-pointer.Api[key]>} & {set (params : json-pointer.json-pointer.DropFirst<std.Parameters<json-pointer.json-pointer.Api['set']>>): json-pointer.json-pointer.BoundApi} */
  trait BoundApi extends StObject {
    
    def dict(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type DropFirst<Parameters<Api[key]>> is not an array type */ params: DropFirst[
          Parameters[
            js.Function2[
              /* object */ JsonObject, 
              /* descend */ js.UndefOr[js.Function1[/* value */ Any, Boolean]], 
              Record[String, Any]
            ]
          ]
        ]
    ): ReturnType[
        js.Function2[
          /* object */ JsonObject, 
          /* descend */ js.UndefOr[js.Function1[/* value */ Any, Boolean]], 
          Record[String, Any]
        ]
      ]
    @JSName("dict")
    var dict_Original: js.Function1[
        /* params */ DropFirst[
          Parameters[
            js.Function2[
              /* object */ JsonObject, 
              /* descend */ js.UndefOr[js.Function1[/* value */ Any, Boolean]], 
              Record[String, Any]
            ]
          ]
        ], 
        ReturnType[
          js.Function2[
            /* object */ JsonObject, 
            /* descend */ js.UndefOr[js.Function1[/* value */ Any, Boolean]], 
            Record[String, Any]
          ]
        ]
      ]
    
    def get(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type DropFirst<Parameters<Api[key]>> is not an array type */ params: DropFirst[
          Parameters[
            js.Function2[/* object */ JsonObject, /* pointer */ String | js.Array[String], Any]
          ]
        ]
    ): ReturnType[
        js.Function2[/* object */ JsonObject, /* pointer */ String | js.Array[String], Any]
      ]
    @JSName("get")
    var get_Original: js.Function1[
        /* params */ DropFirst[
          Parameters[
            js.Function2[/* object */ JsonObject, /* pointer */ String | js.Array[String], Any]
          ]
        ], 
        ReturnType[
          js.Function2[/* object */ JsonObject, /* pointer */ String | js.Array[String], Any]
        ]
      ]
    
    def has(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type DropFirst<Parameters<Api[key]>> is not an array type */ params: DropFirst[
          Parameters[js.Function2[/* object */ Any, /* pointer */ String | js.Array[String], Boolean]]
        ]
    ): ReturnType[js.Function2[/* object */ Any, /* pointer */ String | js.Array[String], Boolean]]
    @JSName("has")
    var has_Original: js.Function1[
        /* params */ DropFirst[
          Parameters[js.Function2[/* object */ Any, /* pointer */ String | js.Array[String], Boolean]]
        ], 
        ReturnType[js.Function2[/* object */ Any, /* pointer */ String | js.Array[String], Boolean]]
      ]
    
    def remove(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type DropFirst<Parameters<Api[key]>> is not an array type */ params: DropFirst[
          Parameters[
            js.Function2[/* object */ JsonObject, /* pointer */ String | js.Array[String], Unit]
          ]
        ]
    ): ReturnType[
        js.Function2[/* object */ JsonObject, /* pointer */ String | js.Array[String], Unit]
      ]
    @JSName("remove")
    var remove_Original: js.Function1[
        /* params */ DropFirst[
          Parameters[
            js.Function2[/* object */ JsonObject, /* pointer */ String | js.Array[String], Unit]
          ]
        ], 
        ReturnType[
          js.Function2[/* object */ JsonObject, /* pointer */ String | js.Array[String], Unit]
        ]
      ]
    
    def set(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type DropFirst<Parameters<Api['set']>> is not an array type */ params: DropFirst[
          Parameters[
            js.Function3[/* object */ JsonObject, /* pointer */ String | js.Array[String], /* value */ Any, Api]
          ]
        ]
    ): BoundApi
    
    def walk(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param params because its type DropFirst<Parameters<Api[key]>> is not an array type */ params: DropFirst[
          Parameters[
            js.Function3[
              /* object */ JsonObject, 
              /* iterator */ js.Function2[/* value */ Any, /* ref */ String, Unit], 
              /* descend */ js.UndefOr[js.Function1[/* value */ Any, Boolean]], 
              Unit
            ]
          ]
        ]
    ): ReturnType[
        js.Function3[
          /* object */ JsonObject, 
          /* iterator */ js.Function2[/* value */ Any, /* ref */ String, Unit], 
          /* descend */ js.UndefOr[js.Function1[/* value */ Any, Boolean]], 
          Unit
        ]
      ]
    @JSName("walk")
    var walk_Original: js.Function1[
        /* params */ DropFirst[
          Parameters[
            js.Function3[
              /* object */ JsonObject, 
              /* iterator */ js.Function2[/* value */ Any, /* ref */ String, Unit], 
              /* descend */ js.UndefOr[js.Function1[/* value */ Any, Boolean]], 
              Unit
            ]
          ]
        ], 
        ReturnType[
          js.Function3[
            /* object */ JsonObject, 
            /* iterator */ js.Function2[/* value */ Any, /* ref */ String, Unit], 
            /* descend */ js.UndefOr[js.Function1[/* value */ Any, Boolean]], 
            Unit
          ]
        ]
      ]
  }
  object BoundApi {
    
    inline def apply(
      dict: /* params */ DropFirst[
          Parameters[
            js.Function2[
              /* object */ JsonObject, 
              /* descend */ js.UndefOr[js.Function1[/* value */ Any, Boolean]], 
              Record[String, Any]
            ]
          ]
        ] => ReturnType[
          js.Function2[
            /* object */ JsonObject, 
            /* descend */ js.UndefOr[js.Function1[/* value */ Any, Boolean]], 
            Record[String, Any]
          ]
        ],
      get: /* params */ DropFirst[
          Parameters[
            js.Function2[/* object */ JsonObject, /* pointer */ String | js.Array[String], Any]
          ]
        ] => ReturnType[
          js.Function2[/* object */ JsonObject, /* pointer */ String | js.Array[String], Any]
        ],
      has: /* params */ DropFirst[
          Parameters[js.Function2[/* object */ Any, /* pointer */ String | js.Array[String], Boolean]]
        ] => ReturnType[js.Function2[/* object */ Any, /* pointer */ String | js.Array[String], Boolean]],
      remove: /* params */ DropFirst[
          Parameters[
            js.Function2[/* object */ JsonObject, /* pointer */ String | js.Array[String], Unit]
          ]
        ] => ReturnType[
          js.Function2[/* object */ JsonObject, /* pointer */ String | js.Array[String], Unit]
        ],
      set: DropFirst[
          Parameters[
            js.Function3[/* object */ JsonObject, /* pointer */ String | js.Array[String], /* value */ Any, Api]
          ]
        ] => BoundApi,
      walk: /* params */ DropFirst[
          Parameters[
            js.Function3[
              /* object */ JsonObject, 
              /* iterator */ js.Function2[/* value */ Any, /* ref */ String, Unit], 
              /* descend */ js.UndefOr[js.Function1[/* value */ Any, Boolean]], 
              Unit
            ]
          ]
        ] => ReturnType[
          js.Function3[
            /* object */ JsonObject, 
            /* iterator */ js.Function2[/* value */ Any, /* ref */ String, Unit], 
            /* descend */ js.UndefOr[js.Function1[/* value */ Any, Boolean]], 
            Unit
          ]
        ]
    ): BoundApi = {
      val __obj = js.Dynamic.literal(dict = js.Any.fromFunction1(dict), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction1(set), walk = js.Any.fromFunction1(walk))
      __obj.asInstanceOf[BoundApi]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BoundApi] (val x: Self) extends AnyVal {
      
      inline def setDict(
        value: /* params */ DropFirst[
              Parameters[
                js.Function2[
                  /* object */ JsonObject, 
                  /* descend */ js.UndefOr[js.Function1[/* value */ Any, Boolean]], 
                  Record[String, Any]
                ]
              ]
            ] => ReturnType[
              js.Function2[
                /* object */ JsonObject, 
                /* descend */ js.UndefOr[js.Function1[/* value */ Any, Boolean]], 
                Record[String, Any]
              ]
            ]
      ): Self = StObject.set(x, "dict", js.Any.fromFunction1(value))
      
      inline def setGet(
        value: /* params */ DropFirst[
              Parameters[
                js.Function2[/* object */ JsonObject, /* pointer */ String | js.Array[String], Any]
              ]
            ] => ReturnType[
              js.Function2[/* object */ JsonObject, /* pointer */ String | js.Array[String], Any]
            ]
      ): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(
        value: /* params */ DropFirst[
              Parameters[js.Function2[/* object */ Any, /* pointer */ String | js.Array[String], Boolean]]
            ] => ReturnType[js.Function2[/* object */ Any, /* pointer */ String | js.Array[String], Boolean]]
      ): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def setRemove(
        value: /* params */ DropFirst[
              Parameters[
                js.Function2[/* object */ JsonObject, /* pointer */ String | js.Array[String], Unit]
              ]
            ] => ReturnType[
              js.Function2[/* object */ JsonObject, /* pointer */ String | js.Array[String], Unit]
            ]
      ): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setSet(
        value: DropFirst[
              Parameters[
                js.Function3[/* object */ JsonObject, /* pointer */ String | js.Array[String], /* value */ Any, Api]
              ]
            ] => BoundApi
      ): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setWalk(
        value: /* params */ DropFirst[
              Parameters[
                js.Function3[
                  /* object */ JsonObject, 
                  /* iterator */ js.Function2[/* value */ Any, /* ref */ String, Unit], 
                  /* descend */ js.UndefOr[js.Function1[/* value */ Any, Boolean]], 
                  Unit
                ]
              ]
            ] => ReturnType[
              js.Function3[
                /* object */ JsonObject, 
                /* iterator */ js.Function2[/* value */ Any, /* ref */ String, Unit], 
                /* descend */ js.UndefOr[js.Function1[/* value */ Any, Boolean]], 
                Unit
              ]
            ]
      ): Self = StObject.set(x, "walk", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait BoundWrapper extends StObject {
    
    def apply(pointer: String): Any = js.native
    def apply(pointer: String, value: Any): BoundApi = js.native
    def apply(pointer: js.Array[String]): Any = js.native
    def apply(pointer: js.Array[String], value: Any): BoundApi = js.native
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends [any, ...infer U] ? U : never
    }}}
    */
  @js.native
  trait DropFirst[T /* <: js.Array[Any] */] extends StObject
  
  type JsonObject = (Record[String | Double, Any]) | js.Array[Any]
  
  @js.native
  trait Wrapper extends StObject {
    
    def apply(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type Parameters<Api['get']> is not an array type */ args: Parameters[
          (js.Function2[/* object */ JsonObject, /* pointer */ String | js.Array[String], Any]) | (js.Function3[/* object */ JsonObject, /* pointer */ String | js.Array[String], /* value */ Any, Api])
        ]
    ): ReturnType[
        js.Function2[/* object */ JsonObject, /* pointer */ String | js.Array[String], Any]
      ] = js.native
    /**
      * Convenience wrapper around the api.
      *
      * @example
      * import pointer = require('json-pointer');
      *
      * const object = {
      *     example: 'hello'
      * };
      *
      * pointer(object);                      // bind object
      * pointer(object, '/example');          // get
      * pointer(object, '/example', 'world'); // set
      *
      * // The wrapper supports chainable object oriented style.
      * const obj = { anything: 'bla' };
      * const objPointer = pointer(obj);
      * objPointer.set('/example', 'bla').dict();
      */
    def apply(`object`: JsonObject): BoundWrapper & BoundApi = js.native
  }
  
  type _To = Wrapper & Api
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Wrapper & Api = ^
}
