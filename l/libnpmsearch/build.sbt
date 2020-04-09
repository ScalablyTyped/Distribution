organization := "org.scalablytyped"
name := "libnpmsearch"
version := "2.0-dt-20190926Z-1a3526"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "form-data" % "3.0.0-c2310a",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20200225Z-738960",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20181031Z-2400e9",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20200323Z-778999",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-90175b",
  "org.scalablytyped" %%% "ssri" % "6.0-dt-20190422Z-c66624",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
