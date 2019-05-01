
# Scala.js typings for idb

Typings are for version 3.0.2

## Library description:
A small wrapper that makes IndexedDB usable

|                    |                 |
| ------------------ | :-------------: |
| Full name          | idb |
| Keywords           | - |
| # releases         | 18 |
| # dependents       | 37 |
| # downloads        | 590527 |
| # stars            | 35 |

## Links
- [Homepage](https://github.com/jakearchibald/idb#readme)
- [Bugs](https://github.com/jakearchibald/idb/issues)
- [Repository](https://github.com/jakearchibald/idb)
- [Npm](https://www.npmjs.com/package/idb)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/** This method returns a promise that resolves to a DB.
 * @param name The name of the database.
 * @param version Optional. The version to open the database with. If the version is not provided and the database exists, then a connection to the database will be opened without changing its version. If the version is not provided and the database does not exist, then it will be created with version 1.
 * @param upgradeCallback Optional. Called if version is greater than the version last opened. It's similar to IDB's onupgradeneeded. The callback receives an instance of UpgradeDB.
 * @returns A Promise that passes the DB once it has been opened. */

```

