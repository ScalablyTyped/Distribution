organization := "org.scalablytyped"
name := "material-components-web"
version := "0.35-dt-20180511Z-a274fc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20180511Z-1b55e4",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180511Z-6c5aff",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20180511Z-dd5ecc",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20180511Z-4067b8",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20180511Z-10652d",
  "org.scalablytyped" %%% "material__drawer" % "0.35-dt-20180511Z-13bb7c",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20180511Z-da87de",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20180511Z-ad6e9d",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20180511Z-43986d",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20180511Z-d86d84",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20180511Z-977739",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20180511Z-45d1c7",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20180809Z-9e7882",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20180511Z-255a34",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20180511Z-dfad7c",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20180511Z-616fba",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20180511Z-754bd6",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20180511Z-0eca2d",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20180511Z-9648a4",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20180511Z-580c25",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20180511Z-400eae",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20180511Z-2ec8bc",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20180511Z-1867f9",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20180511Z-79a722",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        