organization := "org.scalablytyped"
name := "material-components-web"
version := "0.43-dt-20190119Z-bc0ca8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "material__auto-init" % "0.35-dt-20180511Z-d050b6",
  "org.scalablytyped" %%% "material__base" % "0.35-dt-20180511Z-120b37",
  "org.scalablytyped" %%% "material__checkbox" % "0.35-dt-20180511Z-8f876d",
  "org.scalablytyped" %%% "material__chips" % "0.35-dt-20180511Z-bfea15",
  "org.scalablytyped" %%% "material__dialog" % "0.35-dt-20180511Z-01e88e",
  "org.scalablytyped" %%% "material__dom" % "0.43-dt-20190119Z-b46159",
  "org.scalablytyped" %%% "material__drawer" % "0.43-dt-20190119Z-c44988",
  "org.scalablytyped" %%% "material__floating-label" % "0.35-dt-20180511Z-24504d",
  "org.scalablytyped" %%% "material__form-field" % "0.35-dt-20180511Z-858af9",
  "org.scalablytyped" %%% "material__grid-list" % "0.35-dt-20180511Z-0ed731",
  "org.scalablytyped" %%% "material__icon-toggle" % "0.35-dt-20180511Z-0f4b6f",
  "org.scalablytyped" %%% "material__line-ripple" % "0.35-dt-20180511Z-700f0d",
  "org.scalablytyped" %%% "material__linear-progress" % "0.35-dt-20180511Z-daf152",
  "org.scalablytyped" %%% "material__list" % "0.43-dt-20190119Z-053bc5",
  "org.scalablytyped" %%% "material__menu" % "0.35-dt-20180809Z-1f3cdd",
  "org.scalablytyped" %%% "material__notched-outline" % "0.35-dt-20180511Z-be99bf",
  "org.scalablytyped" %%% "material__radio" % "0.35-dt-20180511Z-1bff03",
  "org.scalablytyped" %%% "material__ripple" % "0.35-dt-20180511Z-1cbc6b",
  "org.scalablytyped" %%% "material__select" % "0.35-dt-20180511Z-b2e1da",
  "org.scalablytyped" %%% "material__selection-control" % "0.35-dt-20180511Z-602f3a",
  "org.scalablytyped" %%% "material__slider" % "0.35-dt-20180511Z-e91edc",
  "org.scalablytyped" %%% "material__snackbar" % "0.35-dt-20180511Z-ec677b",
  "org.scalablytyped" %%% "material__tabs" % "0.35-dt-20180511Z-459e7f",
  "org.scalablytyped" %%% "material__textfield" % "0.35-dt-20180511Z-5f3e49",
  "org.scalablytyped" %%% "material__toolbar" % "0.35-dt-20180511Z-947a23",
  "org.scalablytyped" %%% "material__top-app-bar" % "0.35-dt-20180511Z-faae6a",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        