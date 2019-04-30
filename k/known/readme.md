
# Scala.js typings for known

Typings are for version 3.0.0

## Library description:
Allow only access to known object properties using ES2015 Proxy

|                    |                 |
| ------------------ | :-------------: |
| Full name          | known |
| Keywords           | object, property, properties, prop, get, getter, access, proxy, proxies, es2015 |
| # releases         | 2 |
| # dependents       | 1 |
| # downloads        | 242 |
| # stars            | 0 |

## Links
- [Homepage](https://github.com/sindresorhus/known#readme)
- [Bugs](https://github.com/sindresorhus/known/issues)
- [Repository](https://github.com/sindresorhus/known)
- [Npm](https://www.npmjs.com/package/known)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
Allow only access to known object properties using [ES2015 `Proxy`](https://ponyfoo.com/articles/es6-proxies-in-depth).

@example
```
import known = require('known');

const object = {foo: true};

console.log(object.bar);
//=> undefined

const object2 = known(object);

// Throws a TypeError when you try to access an unknown property
console.log(object2.bar);
//=> [TypeError] Unknown property: bar
```
*/

```

