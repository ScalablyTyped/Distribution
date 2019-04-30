
# Scala.js typings for is-plain-obj

Typings are for version 2.0.0

## Library description:
Check if a value is a plain object

|                    |                 |
| ------------------ | :-------------: |
| Full name          | is-plain-obj |
| Keywords           | obj, object, is, check, test, type, plain, vanilla, pure, simple |
| # releases         | 1 |
| # dependents       | 180 |
| # downloads        | 171943129 |
| # stars            | 3 |

## Links
- [Homepage](https://github.com/sindresorhus/is-plain-obj)
- [Bugs](https://github.com/sindresorhus/is-plain-obj/issues)
- [Repository](https://github.com/sindresorhus/is-plain-obj)
- [Npm](https://www.npmjs.com/package/is-plain-obj)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
Check if a value is a plain object.

An object is plain if it's created by either `{}`, `new Object()`, or `Object.create(null)`.

@example
```
import isPlainObject = require('is-plain-obj');

isPlainObject({foo: 'bar'});
//=> true

isPlainObject(new Object());
//=> true

isPlainObject(Object.create(null));
//=> true

isPlainObject([1, 2, 3]);
//=> false

class Unicorn {}
isPlainObject(new Unicorn());
//=> false
```
*/

```

